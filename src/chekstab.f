C> @file
C> @brief Check that an internal BUFR table
C> representation is self-consistent and fully defined.
C>
C> @author Woollen @date 1994-01-06

C> This subroutine checks that an internal BUFR table
C> representation is self-consistent and fully defined. If any errors
C> are found, then an appropriate call is made to bufr archive library
C> subroutine bort().
C>
C> @param LUN I/O stream index into internal memory arrays.
C>
C> @author Woollen @date 1994-01-06
      SUBROUTINE CHEKSTAB(LUN)

      USE MODA_TABABD
      USE MODA_NMIKRP

      CHARACTER*128 BORT_STR
      CHARACTER*24  UNIT
      CHARACTER*8   NEMO
      CHARACTER*1   TAB

C-----------------------------------------------------------------------
C-----------------------------------------------------------------------

C  THERE MUST BE ENTRIES IN TABLES A, B, AND D
C  -------------------------------------------

      IF(NTBA(LUN).EQ.0) GOTO 900
      IF(NTBB(LUN).EQ.0) GOTO 901
      IF(NTBD(LUN).EQ.0) GOTO 902

C  MAKE SURE EACH TABLE A ENTRY DEFINED AS A SEQUENCE
C  --------------------------------------------------

      DO I=1,NTBA(LUN)
      NEMO = TABA(I,LUN)(4:11)
      CALL NEMTAB(LUN,NEMO,IDN,TAB,IRET)
      IF(TAB.NE.'D') GOTO 903
      ENDDO

C  CHECK TABLE B CONTENTS
C  ----------------------

      DO ITAB=1,NTBB(LUN)
      CALL NEMTBB(LUN,ITAB,UNIT,ISCL,IREF,IBIT)
      ENDDO

C  CHECK TABLE D CONTNETS
C  ----------------------

      DO ITAB=1,NTBD(LUN)
      CALL NEMTBD(LUN,ITAB,NSEQ,NEM(1,1),IRP(1,1),KRP(1,1))
      ENDDO

C  EXITS
C  -----

      RETURN
900   CALL BORT
     . ('BUFRLIB: CHEKSTAB - EMPTY TABLE A IN INTERNAL BUFR TABLES')
901   CALL BORT
     . ('BUFRLIB: CHEKSTAB - EMPTY TABLE B IN INTERNAL BUFR TABLES')
902   CALL BORT
     . ('BUFRLIB: CHEKSTAB - EMPTY TABLE D IN INTERNAL BUFR TABLES')
903   WRITE(BORT_STR,'("BUFRLIB: CHEKSTAB - TABLE A ENTRY: ",A," NOT '//
     . 'DEFINED AS A SEQUENCE")') NEMO
      CALL BORT(BORT_STR)
      END
