//Nama File         : JumFrekNilTabel.c
//Deskripsi         : Membuat program untuk menjumlah nilai yang memiliki frekuensi kemunculan lebih dari satu
//Pembuat           : Gigih Haidar Falah - 24060122140150
//Tanggal Pembuatan : Rabu, 13 - 03 - 2024

#include <stdio.h>
#include <stdlib.h>

int main()
{
    //Kamus
    int N;
    int i;
    int sum;

    //Algoritma
    printf("Masukkan jumlah elemen tabel: ");
    scanf("%d", &N);
    printf("Masukkan elemen tabel:\n");
    int T[N];
    int freq[100]={0};
    for(i=0;i<N;i++){
        scanf("%d", &T[i]);
    }

    sum = 0;
    for(i=0;i<N;i++){
        freq[T[i]]++;
    }
    for(i=0;i<100;i++){
        if (freq[i] > 1){
            sum += i * freq[i];
        }
    }
    printf("Jumlah nilai yang memiliki frekuensi lebih dari satu adalah: %d", sum);
    return 0;
}


