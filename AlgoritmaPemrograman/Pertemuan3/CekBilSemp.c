//Nama File         : CekBilSemp.c
//Deskripsi         : Membuat program untuk mengecek apakah N adalah bilangan sempurna
//Pembuat           : Gigih Haidar Falah - 24060122140150
//Tanggal Pembuatan : Rabu, 6 - 02 - 2024

#include <stdio.h>
#include <stdlib.h>

int main()
{
    //Kamus
    int N;      //{bilangan}
    int i;      //{counter}
    int faktor; //{faktor}

    //Algoritma
    printf("Masukan Bilangan : ");
    scanf("%d", &N);

    faktor = 0;
    if (N>0){
        for (i=1;i<N;i++){
            if (N % i == 0){
                faktor += i;
            }
        }
        if (faktor == N){
            printf("Bilangan Sempurna");
        }
        else{
            printf("Bukan Bilangan Sempurna");
        }
    }
    else{
        printf("Masukan Salah!");
    }
    printf("\n");
    return 0;
}
