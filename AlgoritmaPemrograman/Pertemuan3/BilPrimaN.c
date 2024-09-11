//Nama File         : BilPrimaN.c
//Deskripsi         : Membuat program untuk menghitung bilangan prima pada N bilangan
//Pembuat           : Gigih Haidar Falah - 24060122140150
//Tanggal Pembuatan : Rabu, 6 - 02 - 2024

#include <stdio.h>
#include <stdlib.h>

int main()
{
    //Kamus
    int N;      //{bilangan}
    int i;      //{counter 1}
    int j;      //{counter 2}
    int faktor; //{faktor}

    //Algoritma
    printf("Masukan Bilangan : ");
    scanf("%d",&N);

    printf("Bilangan Prima dari deret %d adalah : ", N);
    if (N>0){
        for(i=1;i<=N;i++){
            faktor = 0;
            for(j=1;j<=i;j++){
                if (i % j == 0){
                    faktor += 1;
                }
            }
            if (faktor == 2){
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
