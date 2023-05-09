/** @file
 *  @brief Dynamically allocate C language arrays.
 * @author J. Ator @date 2014-12-04
*/

#include "bufrlib.h"

/** Macro to control whether certain variables are explicitly declared
 * or referenced as extern. */
#define IN_ARALLOCC
#include "cread.h"
#include "mstabs.h"

/**
 * Dynamically allocate C language arrays.
 *
 * This subroutine is called internally during the first call to
 * subroutine openbf() from an application program, in order to
 * dynamically allocate internal C language arrays based on parameter
 * values set during one or more previous calls to function isetprm().
 *
 * All memory allocated within this subroutine can be freed via a
 * subsequent call to subroutine exitbufr().
 *
 * @author J. Ator @date 2014-12-04
 */

void
arallocc(void)
{

    char brtstr[50] = "BUFRLIB: ARALLOCC FAILED ALLOCATING";

    int nfiles;

    int mxmtbb;
    int mxmtbd;
    int maxcd;

/*
**  cread arrays
*/

    nfiles = igetprm_f("NFILES");

    if (!(pb = malloc((nfiles+1) * sizeof(FILE *)))) 
        bort(brtstr, (f77int) strlen(brtstr));

    if (!(lstpos = malloc((nfiles+1) * sizeof(fpos_t))))
        bort(brtstr, (f77int) strlen(brtstr));

/*
**  mstabs arrays
*/

    mxmtbb = igetprm_f("MXMTBB");
    mxmtbd = igetprm_f("MXMTBD");
    maxcd = igetprm_f("MAXCD");

    if (!(ibfxyn_c = malloc(mxmtbb * sizeof(f77int)))) 
        bort(brtstr, (f77int) strlen(brtstr));

    if (!(cbscl_c = malloc(mxmtbb * 4 * sizeof(char)))) 
        bort(brtstr, (f77int) strlen(brtstr));

    if (!(cbsref_c = malloc(mxmtbb * 12 * sizeof(char))))
        bort(brtstr, (f77int) strlen(brtstr));

    if (!(cbbw_c = malloc(mxmtbb * 4 * sizeof(char))))
        bort(brtstr, (f77int) strlen(brtstr));

    if (!(cbunit_c = malloc(mxmtbb * 24 * sizeof(char))))
        bort(brtstr, (f77int) strlen(brtstr));

    if (!(cbmnem_c = malloc(mxmtbb * 8 * sizeof(char))))
        bort(brtstr, (f77int) strlen(brtstr));

    if (!(cbelem_c = malloc(mxmtbb * 120 * sizeof(char))))
        bort(brtstr, (f77int) strlen(brtstr));

    if (!(idfxyn_c = malloc(mxmtbd * sizeof(f77int))))
        bort(brtstr, (f77int) strlen(brtstr));

    if (!(cdseq_c = malloc(mxmtbd * 120 * sizeof(char))))
        bort(brtstr, (f77int) strlen(brtstr));

    if (!(cdmnem_c = malloc(mxmtbd * 8 * sizeof(char))))
        bort(brtstr, (f77int) strlen(brtstr));

    if (!(ndelem_c = malloc(mxmtbd * sizeof(f77int))))
        bort(brtstr, (f77int) strlen(brtstr));

    if (!(idefxy_c = malloc(mxmtbd * maxcd * sizeof(f77int))))
        bort(brtstr, (f77int) strlen(brtstr ) );
}
