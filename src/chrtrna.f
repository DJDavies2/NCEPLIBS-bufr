      SUBROUTINE CHRTRNA(STR,CHR,N)

C$$$  SUBPROGRAM DOCUMENTATION BLOCK
C
C SUBPROGRAM:    CHRTRNA
C   PRGMMR: WOOLLEN          ORG: NP20       DATE: 1994-01-06
C
C ABSTRACT: THIS SUBROUTINE COPIES A SPECIFIED NUMBER OF CHARACTERS
C   FROM A CHARACTER ARRAY INTO A CHARACTER STRING.  THE DIFFERENCE
C   BETWEEN THIS SUBROUTINE AND BUFR ARCHIVE LIBRARY SUBROUTINE CHRTRN
C   IS THAT, IN THIS SUBROUTINE, THE INPUT CHARACTER ARRAY IS ASSUMED
C   TO BE IN ASCII; THUS, FOR CASES WHERE THE NATIVE MACHINE IS EBCDIC,
C   AN ASCII TO EBCDIC TRANSLATION IS DONE ON THE FINAL STRING BEFORE
C   IT IS OUTPUT.
C
C PROGRAM HISTORY LOG:
C 1994-01-06  J. WOOLLEN -- ORIGINAL AUTHOR
C 2003-11-04  J. ATOR    -- ADDED DOCUMENTATION
C 2003-11-04  S. BENDER  -- ADDED REMARKS/BUFRLIB ROUTINE
C                           INTERDEPENDENCIES
C 2003-11-04  D. KEYSER  -- UNIFIED/PORTABLE FOR WRF; ADDED HISTORY
C                           DOCUMENTATION
C
C USAGE:    CALL CHRTRNA (STR, CHR, N)
C   INPUT ARGUMENT LIST:
C     CHR      - CHARACTER*1: N-WORD CHARACTER ARRAY IN ASCII
C     N        - INTEGER: NUMBER OF CHARACTERS TO COPY
C
C   OUTPUT ARGUMENT LIST:
C     STR      - CHARACTER*(*): CHARACTER STRING IN ASCII OR EBCDIC,
C                DEPENDING ON NATIVE MACHINE
C
C REMARKS:
C    THIS ROUTINE CALLS:        IPKM     IUPM
C    THIS ROUTINE IS CALLED BY: ICHKSTR
C                               Normally not called by any application
C                               programs.
C
C ATTRIBUTES:
C   LANGUAGE: FORTRAN 77
C   MACHINE:  PORTABLE TO ALL PLATFORMS
C
C$$$

      COMMON /CHARAC/ IASCII,IATOE(0:255),IETOA(0:255)

      CHARACTER*(*) STR
      CHARACTER*1   CHR(N)

C----------------------------------------------------------------------
C----------------------------------------------------------------------

C     Loop on N characters of CHR

      DO I=1,N
      STR(I:I) = CHR(I)

C     If this is an EBCDIC machine, then translate the character
C     from ASCII -> EBCDIC.

      IF(IASCII.EQ.0) CALL IPKM(STR(I:I),1,IATOE(IUPM(STR(I:I),8)))
      ENDDO
      RETURN
      END
