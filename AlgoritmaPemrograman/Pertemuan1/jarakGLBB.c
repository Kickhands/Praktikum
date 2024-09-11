//Nama File         : jarakGLBB.c
//Deskripsi         : Membuat program untuk menghitung jarak yang ditempuh benda yang mengalami gerak lurus berubah beraturan
//Nama              : GIGIH HAIDAR FALAH
//Tanggal Pembuatan : Kamis, 22 Februari 2024

#include <stdio.h>
#include <stdlib.h>

int main ()
{
    //Kamus
    float v0, t, a, S;

    //Algoritmaa
    printf("Kecepatan awal = ");
    scanf("%f", &v0);
    printf("Waktu = ");
    scanf("%f", &t);
    printf("Percepatan = ");
    scanf("%f", &a);

    S = v0 * t + 0.5 * (a * pow(t,2));

    printf("\nJarak S = %f \n", S);

    return 0;
}
