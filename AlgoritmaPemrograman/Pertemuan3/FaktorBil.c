//Nama File         : FaktorBil.c
//Deskripsi         : Membuat program untuk mencari faktor dari bilangan N
//Pembuat           : Gigih Haidar Falah - 24060122140150
//Tanggal Pembuatan : Rabu, 6 - 02 - 2024

#include <stdio.h>
#include <stdlib.h>

int main()
{
    //Kamus
    int N;  //{bilangan}
    int i;  //{counter}

    //Algoritma
    printf("Masukan Bilangan : ");
    scanf("%d", &N);

    printf("Faktor dari %d adalah : ", N);
    if (N>0){
        for (i=1;i<=N;i++){
            if (N % i == 0){
                printf("%d", i);
                printf(" ");
            }
        }
    }
    else{
        printf("Masukan Salah!");
    }
    printf("\n");
    return 0;
}
