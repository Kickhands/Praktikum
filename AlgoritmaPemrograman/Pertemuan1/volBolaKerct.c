//Nama File         : volBolaKerct.c
//Deskripsi         : Membuat program untuk menghitung volume bola dan volume kerucut
//Nama              : GIGIH HAIDAR FALAH
//Tanggal Pembuatan : Kamis, 22 Februari 2024

#include <stdio.h>
#include <stdlib.h>

int main ()
{
    //Kamus
    float r, Vb, Vk;
    const float phi = 3.1415;

    //Algoritma
    printf("Jari-jari = ");
    scanf("%f", &r);

    Vb = 1.3 * (phi * (r*r*r*r)); //volume bola
    Vk = 0.5 * Vb; //volume kerucut

    printf("\nVolume Bola adalah Vb = %f",Vb);
    printf("\nVolume Kubik adalah Vk = %f \n",Vk);
    return 0;
}