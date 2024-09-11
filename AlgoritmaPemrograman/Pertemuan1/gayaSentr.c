//Nama File         : gayaSentr.c
//Deskripsi         : Membuat program untuk menghitung gaya
//Nama              : GIGIH HAIDAR FALAH
//Tanggal Pembuatan : Kamis, 22 Februari 2024

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

    F = m * ((v*v*v)/r);

    printf("\nGayanya adalah F = %f \n", F);
    return 0;
}