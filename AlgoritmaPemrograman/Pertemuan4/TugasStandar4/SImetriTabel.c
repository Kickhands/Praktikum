//Nama File         : SimetriTabel.c
//Deskripsi         : Membuat program untuk mengecek apakah tabel 1 dan tabel 2 simetri atau tidak
//Pembuat           : Gigih Haidar Falah - 24060122140150
//Tanggal Pembuatan : Rabu, 13 - 03 - 2024

#include <stdio.h>
#include <stdlib.h>

int main()
{
    //Kamus
    int N1;
    int N2;
    int i;
    int sum;

    //Algoritma
    printf("Masukkan jumlah elemen tabel 1: ");
    scanf("%d", &N1);
    printf("Masukkan elemen tabel 1:\n");
    int T1[N1];
    for (i = 0; i < N1; i++) {
        scanf("%d", &T1[i]);
    }
    printf("Masukkan jumlah elemen tabel 2: ");
    scanf("%d", &N2);
    printf("Masukkan elemen tabel 2:\n");
    int T2[N2];
    for (i = 0; i < N2; i++) {
        scanf("%d", &T2[i]);
    }

    sum = 0;
    if (N1==N2){
        for(i=0;i<N1;i++){
            if (T1[i]==T2[i]){
                sum += 1;
            }
        }
        if(sum == N1){
            printf("Simetri");
        }
        else{
            printf("Tidak Simetri");
        }
    }
    else{
        printf("Tidak Simetri");
    }
    return 0;
}
