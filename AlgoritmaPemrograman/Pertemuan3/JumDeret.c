//Nama File         : JumDeret.c
//Deskripsi         : Membuat program untuk menghitung jumlah penambahan dari n-deret bilangan
//Pembuat           : Gigih Haidar Falah - 24060122140150
//Tanggal Pembuatan : Rabu, 6 - 02 - 2024

#include <stdio.h>
#include <stdlib.h>

int main()
{
    //Kamus
    int N;          //{bilangan}
    int i;          //{counter}
    int total;      //{total penjumlahan}

    //Algoritma
    printf("Masukan bilangan : ");
    scanf("%d", &N);

    total = 0;
    if (N>0){
        for (i=1;i<=N;i++){
            total += i;
        }
        printf("Total Penjumlahan = %d",total);
    }
    else{
        printf("Input Salah!");
    }
    printf("\n");
    return 0;
}
