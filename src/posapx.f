C> @file
C> @brief Position an output BUFR file for appending.
C> 
C> ### Program History Log
C> Date | Programmer | Comments
C> -----|------------|----------
C> 1994-01-06 | J. Woollen | Original author.
C> 1998-07-08 | J. Woollen | Replaced call to cray library routine "abort" with bort().
C> 2000-09-19 | J. Woollen | Maximum message length increased from 10,000 to 20,000 bytes.
C> 2003-11-04 | S. Bender  | Added remarks/bufrlib routine interdependencies.
C> 2003-11-04 | D. Keyser  | Unified/portable for wrf; added documentation (including history); outputs more.
C> 2004-08-09 | J. Ator    | Maximum message length increased from 20,000 to 50,000 bytes.
C> 2009-03-23 | J. Ator    | Modified to handle embedded bufr table (dictionary) messages; added lunxx < 0 option to simulate posapn.
C> 2010-05-11 | J. Ator    | Set iscodes to -1 if unsuccessful.
C> 2012-09-15 | J. Woollen | Modified for c/i/o/bufr interface; replace fortran backspace with c backbufr remove unecessary error checking logic.
C> 2014-12-10 | J. Ator    | Use modules instead of common blocks.
C> 
C> @author Woollen @date 1994-01-06
      
C> This subroutine reads to the end of the file pointed to by
C> abs(LUNXX) and positions it for appending. The file must have
C> already been opened for output operations.
C> 
C< If LUNXX > 0, then the file is backspaced before being positioned for append.
C> If LUNXX < 0, then the file is not backspaced before being positioned for append.
C>
C> @param[in] LUNXX - integer: absolute value is fortran logical unit number
C> for BUFR file
C>
C> @author Woollen @date 1994-01-06
      SUBROUTINE POSAPX(LUNXX)

      USE MODA_MGWA

C-----------------------------------------------------------------------
C-----------------------------------------------------------------------

      LUNIT = ABS(LUNXX)

      CALL STATUS(LUNIT,LUN,IL,IM)
      IF(IL.EQ.0) GOTO 901
      IF(IL.LT.0) GOTO 902

C  TRY TO READ TO THE END OF THE FILE
C  ----------------------------------

1     CALL RDMSGW(LUNIT,MGWA,IER)
      IF(IER.LT.0) RETURN
      IF(IDXMSG(MGWA).EQ.1) THEN

C	This is an internal dictionary message that was generated by the
C	BUFR archive library software.  Backspace the file pointer and
C	then read and store all such dictionary messages (they should be
C	stored consecutively!) and reset the internal tables.

	CALL BACKBUFR(LUN) !BACKSPACE LUNIT
	CALL RDBFDX(LUNIT,LUN)

      ENDIF
      GOTO 1

C  ERROR EXITS
C  -----------

901   CALL BORT('BUFRLIB: POSAPX - INPUT BUFR FILE IS CLOSED, IT MUST'//
     . ' BE OPEN FOR OUTPUT')
902   CALL BORT('BUFRLIB: POSAPX - INPUT BUFR FILE IS OPEN FOR INPUT'//
     . ', IT MUST BE OPEN FOR OUTPUT')
      END
