//Nama File         : gayaSentr.c
//Deskripsi         : Membuat program untuk menghitung gaya
//Pembuat           : Gigih Haidar Falah - 24060122140150
//Tanggal Pembuatan : //Tanggal Pembuatan : Kamis, 22 - 02 - 2024


#include <stdio.h>
#include <stdlib.h>

int main ()
{
    //Kamus
    float m, v, r, F;

    //Algoritma
    printf("Massa = ");
    scanf("%f", &m);
    printf("Kecepatan = ");
    scanf("%f", &v);
    printf("Jari-jari = ");
    scanf("%f", &r);

    F = m * (pow(v,2)/r);

    printf("\nGayanya adalah F = %f \n", F);
    return 0;
}