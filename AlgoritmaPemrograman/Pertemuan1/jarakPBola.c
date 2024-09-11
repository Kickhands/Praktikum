//Nama File         : jarakPBola.c
//Deskripsi         : Membuat program untuk menghitung jarak yang ditempuh benda yang mengalami gerak parabola
//Nama              : GIGIH HAIDAR FALAH
//Tanggal Pembuatan : Kamis, 22 Februari 2024

#include <stdio.h>
#include <stdlib.h>

int main ()
{
    //Kamus
    float v0, t, y;
    const float g = 9.8;

    //Algoritma
    printf("Kecepatan awal = ");
    scanf("%f", &v0);
    printf("Waktu = ");
    scanf("%f", &t);

    y = v0 * t - 0.5 * (g * (t*t*t));

    printf("\nJarak y = %f \n", y);

    return 0;
}