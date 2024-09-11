//Nama File         : BukanKelipatanK.c
//Deskripsi         : Membuat Deret sesuai limit n dan menghindari angka k yang telah di input
//Pembuat           : Gigih Haidar Falah - 24060122140150
//Tanggal Pembuatan : Rabu, 6 - 02 - 2024

#include <stdio.h>
#include <stdlib.h>

int main()
{
    // Kamus
    int k;      //{bilangan}
    int n;      //{counter 1}
    int i;      //{counter 2}

    // Algoritma
    printf("Masukan k : ");
    scanf("%d", &k);
    printf("Masukkan n: ");
    scanf("%d", &n);

    printf("Deret Bilangan \n");
    if (k > 0) {
        for (i = 1; i <= n; i++) {
            if (i % k != 0) {
                printf("%d ", i);
            }
        }
    } else {
        printf("Masukan Salah!");
    }

    printf("\n");
    return 0;
}
