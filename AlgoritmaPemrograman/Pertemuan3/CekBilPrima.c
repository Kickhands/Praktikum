//Nama File         : CekBilPrima.c
//Deskripsi         : Membuat program untuk mengecek apakah N adalah bilangan prima
//Pembuat           : Gigih Haidar Falah - 24060122140150
//Tanggal Pembuatan : Rabu, 6 - 02 - 2024

#include <stdio.h>
#include <stdlib.h>

int main()
{
    //Kamus
    int N;      //{bilangan}
    int i;      //{counter 1}
    int faktor; //{faktor}

    //Algoritma
    printf("Masukan Bilangan : ");
    scanf("%d",&N);

    faktor = 0;
    if (N>0){
        for(i=1;i<=N;i++){
            if (N % i == 0){
                faktor += 1;
            }
        }
        if (faktor == 2){
            printf("Bilangan Prima");
        }
        else{
            printf("Bukan Bilangan Prima");
        }
    }
    else{
        printf("Masukan salah!");
    }
    printf("\n");
    return 0;
}
