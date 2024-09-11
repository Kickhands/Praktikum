/****************************************************************/
/*                                                              */
/* Nama File        : driverTabel.h                             */
/* Deskripsi        : Driver Abstract Data Type Tabel           */
/* Nama Pembuat     : GIGIH HAIDAR FALAH                      */
/* NIM              : 24060122140150                        */
/* Tanggal dibuat   : 20 Maret 2024                             */
/*                                                              */
/****************************************************************/
#include "Tabel.c"
#include <stdio.h>
int main(){
    /*Program Utama*/

    /*Kamus Lokal*/
        TabInt T;

    /*Algoritma*/
        CreateEmpty(&T);
        printf("Indek Efektif CreateEmpty(TabInt* T)=%d\n", T.NEff);
        printf("IsIdxValid(TabInt T, IdxType i)=%d\n", IsIdxValid(T,10));
        printf("IsIdxEff(TabInt T, IdxType i)=%d\n", IsIdxEff(T,2));
        printf("IsEmpty(TabInt T)=%d\n", IsEmpty(T)); /*8*/
        printf("IsFull(TabInt T)=%d\n", IsFull(T));
        PrintTabel(T);
        IsiTabel(&T,10);
        PrintTabel(T);
        printf("ValMax(TabInt T)=%d\n", ValMax(T));
        printf("ValMin(TabInt T)=%d\n", ValMin(T));
        printf("IdxValMax(TabInt T)=%d\n", IdxValMax(T));
        printf("IdxValMin(TabInt T)=%d\n", IdxValMin(T));
        printf("Indek Efektif CreateEmpty(TabInt* T)=%d\n", T.NEff);

    return 0;
}
