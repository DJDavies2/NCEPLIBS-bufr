      SUBROUTINE UFBTAM(TAB,I1,I2,IRET,STR)

C$$$  SUBPROGRAM DOCUMENTATION BLOCK
C
C SUBPROGRAM:    UFBTAM
C   PRGMMR: WOOLLEN          ORG: NP20       DATE: 1994-01-06
C
C ABSTRACT: THIS SUBROUTINE READS SPECIFIED VALUES INTO INTERNAL ARRAYS
C   FROM ALL DATA SUBSETS IN BUFR MESSAGES STORED IN INTERNAL MEMORY.
C   THE DATA VALUES CORRESPOND TO MNEMONICS, NORMALLY WHERE THERE IS NO
C   REPLICATION (THERE CAN BE REGULAR OR DELAYED REPLICATION, BUT THIS
C   SUBROUTINE WILL ONLY READ THE FIRST OCCURRENCE OF THE MNEMONIC IN
C   EACH SUBSET).  UFBTAM PROVIDES A MECHANISM WHEREBY A USER CAN DO A
C   QUICK SCAN OF THE RANGE OF VALUES CORRESPONDING TO ONE OR MORE
C   MNEMNONICS AMONGST ALL DATA SUBSETS FOR A GROUP OF BUFR MESSAGES
C   STORED IN INTERNAL MEMORY, NO OTHER BUFR ARCHIVE LIBRARY ROUTINES
C   HAVE TO BE CALLED.  THIS SUBROUTINE IS SIMILAR TO BUFR ARCHIVE
C   LIBRARY SUBROUTINE UFBTAB EXCEPT UFBTAB READS SUBSETS FROM MESSAGES
C   IN A PHYSICAL BUFR FILE.  UFBTAM CURRENTLY CANNOT READ DATA FROM
C   COMPRESSED BUFR MESSAGES.
C
C PROGRAM HISTORY LOG:
C 1994-01-06  J. WOOLLEN -- ORIGINAL AUTHOR
C 1998-07-08  J. WOOLLEN -- REPLACED CALL TO CRAY LIBRARY ROUTINE
C                           "ABORT" WITH CALL TO NEW INTERNAL BUFRLIB
C                           ROUTINE "BORT"
C 1998-10-27  J. WOOLLEN -- MODIFIED TO CORRECT PROBLEMS CAUSED BY IN-
C                           LINING CODE WITH FPP DIRECTIVES
C 1999-11-18  J. WOOLLEN -- THE NUMBER OF BUFR FILES WHICH CAN BE
C                           OPENED AT ONE TIME INCREASED FROM 10 TO 32
C                           (NECESSARY IN ORDER TO PROCESS MULTIPLE
C                           BUFR FILES UNDER THE MPI)
C 2000-09-19  J. WOOLLEN -- MAXIMUM MESSAGE LENGTH INCREASED FROM
C                           10,000 TO 20,000 BYTES
C 2001-08-15  D. KEYSER  -- PARAMETER MAXMEM (THE MAXIMUM NUMBER OF
C                           BYTES REQUIRED TO STORE ALL MESSAGES
C                           INTERNALLY) WAS INCREASED FROM 8 MBYTES TO
C                           16 MBYTES; MODIFIED TO NOT ABORT WHEN THERE
C                           ARE TOO MANY SUBSETS COMING IN (I.E., .GT.
C                           I2), BUT RATHER JUST PROCESS I2 REPORTS AND
C                           PRINT A DIAGNOSTIC
C 2002-05-14  J. WOOLLEN -- REMOVED OLD CRAY COMPILER DIRECTIVES
C 2003-11-04  S. BENDER  -- ADDED REMARKS/BUFRLIB ROUTINE
C                           INTERDEPENDENCIES
C 2003-11-04  D. KEYSER  -- PARAMETER MAXMSG (THE MAXIMUM NUMBER OF
C                           BUFR MESSAGES WHICH CAN BE STORED
C                           INTERNALLY) INCREASED FROM 50000 TO 200000;
C                           MAXJL (MAXIMUM NUMBER OF JUMP/LINK ENTRIES)
C                           INCREASED FROM 15000 TO 16000 (WAS IN
C                           VERIFICATION VERSION); UNIFIED/PORTABLE FOR
C                           WRF; ADDED DOCUMENTATION (INCLUDING
C                           HISTORY); OUTPUTS MORE COMPLETE DIAGNOSTIC
C                           INFO WHEN ROUTINE TERMINATES ABNORMALLY
C 2004-08-09  J. ATOR    -- MAXIMUM MESSAGE LENGTH INCREASED FROM
C                           20,000 TO 50,000 BYTES
C 2004-11-15  D. KEYSER  -- PARAMETER MAXMEM (THE MAXIMUM NUMBER OF
C                           BYTES REQUIRED TO STORE ALL MESSAGES
C                           INTERNALLY) WAS INCREASED FROM 16 MBYTES TO
C                           50 MBYTES
C 2007-01-19  J. ATOR    -- REPLACED CALL TO PARSEQ WITH CALL TO PARSTR
C 2009-04-21  J. ATOR    -- USE ERRWRT
C 2009-10-21  D. KEYSER  -- ADDED OPTION TO INPUT NEW MNEMONIC "ITBL"
C                           IN ARGUMENT STR, RETURNS THE BUFR
C                           DICTIONARY TABLE NUMBER ASSOCIATED WITH
C                           EACH SUBSET IN INTERNAL MEMORY
C 2012-03-02  J. ATOR    -- USE FUNCTION UPS
C 2014-12-10  J. ATOR    -- USE MODULES INSTEAD OF COMMON BLOCKS
C
C USAGE:    CALL UFBTAM (TAB, I1, I2, IRET, STR)
C   INPUT ARGUMENT LIST:
C     I1       - INTEGER: LENGTH OF FIRST DIMENSION OF TAB (MUST BE AT
C                LEAST AS LARGE AS THE NUMBER OF BLANK-SEPARATED
C                MNEMONICS IN STR)
C     I2       - INTEGER: LENGTH OF SECOND DIMENSION OF TAB
C     STR      - CHARACTER*(*): STRING OF BLANK-SEPARATED TABLE B
C                MNEMONICS IN ONE-TO-ONE CORRESPONDENCE WITH FIRST
C                DIMENSION OF TAB
C                  - THERE ARE THREE "GENERIC" MNEMONICS NOT RELATED
C                     TO TABLE B, THESE RETURN THE FOLLOWING
C                     INFORMATION IN CORRESPONDING TAB LOCATION:
C                     'NUL'  WHICH ALWAYS RETURNS BMISS ("MISSING")
C                     'IREC' WHICH ALWAYS RETURNS THE BUFR MESSAGE
C                            (RECORD) NUMBER IN WHICH EACH SUBSET IN
C                            INTERNAL MEMORY RESIDES
C                     'ISUB' WHICH ALWAYS RETURNS THE LOCATION WITHIN
C                            MESSAGE "IREC" (I.E., THE SUBSET NUMBER)
C                            FOR EACH SUBSET IN INTERNAL MEMORY
C                     'ITBL' WHICH ALWAYS RETURNS THE BUFR DICTIONARY
C                            TABLE NUMBER ASSOCIATED WITH EACH SUBSET
C                            IN INTERNAL MEMORY
C
C   OUTPUT ARGUMENT LIST:
C     TAB      - REAL*8: (I1,I2) STARTING ADDRESS OF DATA VALUES READ
C                FROM INTERNAL MEMORY
C     IRET     - INTEGER: NUMBER OF DATA SUBSETS IN INTERNAL MEMORY
C                (MUST BE NO LARGER THAN I2)
C
C REMARKS:
C    NOTE THAT UFBMEM IS CALLED PRIOR TO THIS TO STORE THE BUFR
C    MESSAGES INTO INTERNAL MEMORY.
C
C    THIS ROUTINE CALLS:        BORT     ERRWRT   NMSUB    PARSTR
C                               RDMEMM   STATUS   STRING   UPB
C                               UPBB     UPC      UPS      USRTPL
C    THIS ROUTINE IS CALLED BY: None
C                               Normally called only by application
C                               programs.
C
C ATTRIBUTES:
C   LANGUAGE: FORTRAN 77
C   MACHINE:  PORTABLE TO ALL PLATFORMS
C
C$$$

      USE MODA_USRINT
      USE MODA_MSGCWD
      USE MODA_BITBUF
      USE MODA_MSGMEM
      USE MODA_TABLES

      INCLUDE 'bufrlib.prm'

      COMMON /USRSTR/ NNOD,NCON,NODS(20),NODC(10),VALS(10),KONS(10)
      COMMON /QUIET / IPRT

      CHARACTER*(*) STR
      CHARACTER*128 BORT_STR,ERRSTR
      CHARACTER*10  TGS(100)
      CHARACTER*8   SUBSET,CVAL
      EQUIVALENCE   (CVAL,RVAL)
      REAL*8        TAB(I1,I2),RVAL,UPS

      DATA MAXTG /100/

C-----------------------------------------------------------------------
      MPS(NODE) = 2**(IBT(NODE))-1
C-----------------------------------------------------------------------

      IRET = 0

      IF(MSGP(0).EQ.0) GOTO 100

      DO J=1,I2
      DO I=1,I1
      TAB(I,J) = BMISS
      ENDDO
      ENDDO

C  CHECK FOR SPECIAL TAGS IN STRING
C  --------------------------------

      CALL PARSTR(STR,TGS,MAXTG,NTG,' ',.TRUE.)
      IREC = 0
      ISUB = 0
      ITBL = 0
      DO I=1,NTG
      IF(TGS(I).EQ.'IREC') IREC = I
      IF(TGS(I).EQ.'ISUB') ISUB = I
      IF(TGS(I).EQ.'ITBL') ITBL = I
      ENDDO

C  READ A MESSAGE AND PARSE A STRING
C  ---------------------------------

      CALL STATUS(MUNIT,LUN,IL,IM)

      DO IMSG=1,MSGP(0)
      CALL RDMEMM(IMSG,SUBSET,JDATE,MRET)
      IF(MRET.LT.0) GOTO 900

      CALL STRING(STR,LUN,I1,0)
      IF(IREC.GT.0) NODS(IREC) = 0
      IF(ISUB.GT.0) NODS(ISUB) = 0
      IF(ITBL.GT.0) NODS(ITBL) = 0

C  PROCESS ALL THE SUBSETS IN THE MEMORY MESSAGE
C  ---------------------------------------------

      DO WHILE (NSUB(LUN).LT.MSUB(LUN))
         IF(IRET+1.GT.I2) GOTO 99
         IRET = IRET+1

         DO I=1,NNOD
         NODS(I) = ABS(NODS(I))
         ENDDO

         CALL USRTPL(LUN,1,1)
         MBIT = MBYT(LUN)*8+16
         NBIT = 0
         N = 1

20       IF(N+1.LE.NVAL(LUN)) THEN
            N = N+1
            NODE = INV(N,LUN)
            MBIT = MBIT+NBIT
            NBIT = IBT(NODE)
            IF(ITP(NODE).EQ.1) THEN
               CALL UPBB(IVAL,NBIT,MBIT,MBAY(1,LUN))
               CALL USRTPL(LUN,N,IVAL)
            ENDIF
            DO I=1,NNOD
            IF(NODS(I).EQ.NODE) THEN
               IF(ITP(NODE).EQ.1) THEN
                  CALL UPBB(IVAL,NBIT,MBIT,MBAY(1,LUN))
                  TAB(I,IRET) = IVAL
               ELSEIF(ITP(NODE).EQ.2) THEN
                  CALL UPBB(IVAL,NBIT,MBIT,MBAY(1,LUN))
                  IF(IVAL.LT.MPS(NODE)) TAB(I,IRET) = UPS(IVAL,NODE)
               ELSEIF(ITP(NODE).EQ.3) THEN
                  CVAL = ' '
                  KBIT = MBIT
                  CALL UPC(CVAL,NBIT/8,MBAY(1,LUN),KBIT,.TRUE.)
                  TAB(I,IRET) = RVAL
               ENDIF
               NODS(I) = -NODS(I)
               GOTO 20
            ENDIF
            ENDDO
            DO I=1,NNOD
            IF(NODS(I).GT.0) GOTO 20
            ENDDO
         ENDIF

C  UPDATE THE SUBSET POINTERS BEFORE NEXT READ
C  -------------------------------------------

         IBIT = MBYT(LUN)*8
         CALL UPB(NBYT,16,MBAY(1,LUN),IBIT)
         MBYT(LUN) = MBYT(LUN) + NBYT
         NSUB(LUN) = NSUB(LUN) + 1
         IF(IREC.GT.0) TAB(IREC,IRET) = NMSG(LUN)
         IF(ISUB.GT.0) TAB(ISUB,IRET) = NSUB(LUN)
         IF(ITBL.GT.0) TAB(ITBL,IRET) = LDXTS
      ENDDO

      ENDDO

      GOTO 200

C  EMERGENCY ROOM TREATMENT FOR ARRAY OVERFLOW
C  -------------------------------------------

99    CALL RDMEMM(0,SUBSET,JDATE,MRET)
      NREP = 0
      DO IMSG=1,MSGP(0)
      CALL RDMEMM(IMSG,SUBSET,JDATE,MRET)
      IF(MRET.LT.0) GOTO 900
      NREP = NREP+NMSUB(MUNIT)
      ENDDO
      IF(IPRT.GE.0) THEN
      CALL ERRWRT('+++++++++++++++++++++WARNING+++++++++++++++++++++++')
      WRITE ( UNIT=ERRSTR, FMT='(A,A,I8,A,A)' )
     . 'BUFRLIB: UFBTAM - THE NO. OF DATA SUBSETS IN MEMORY ',
     . 'IS .GT. LIMIT OF ', I2, ' IN THE 3RD ARG. (INPUT) - ',
     . 'INCOMPLETE READ'
      CALL ERRWRT(ERRSTR)
      WRITE ( UNIT=ERRSTR, FMT='(A,I8,A,I8,A)' )
     . '>>>UFBTAM STORED ', IRET, ' REPORTS OUT OF ', NREP, '<<<'
      CALL ERRWRT(ERRSTR)
      CALL ERRWRT('+++++++++++++++++++++WARNING+++++++++++++++++++++++')
      CALL ERRWRT(' ')
      ENDIF

C  RESET THE MEMORY FILE
C  ---------------------

200   CALL RDMEMM(0,SUBSET,JDATE,MRET)

C  EXITS
C  -----

100   RETURN
900   WRITE(BORT_STR,'("BUFRLIB: UFBTAM - HIT END-OF-FILE READING '//
     . 'MESSAGE NUMBER",I5," IN INTERNAL MEMORY")') IMSG
      CALL BORT(BORT_STR)
      END
