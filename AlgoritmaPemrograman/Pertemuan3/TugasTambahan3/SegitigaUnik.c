//Nama File         : SegitigaUnik.c
//Deskripsi         : Membuat deret angka sesuai dengan line nya, untuk deret angka 0-9 apabila sampai 9 kembali ke 1 lagi dan seterusnya
//Pembuat           : Gigih Haidar Falah - 24060122140150
//Tanggal Pembuatan : Rabu, 6 - 02 - 2024

#include <stdio.h>
#include <stdlib.h>

int main() {

    //Kamus
    int n;
    int x = 0;
    int y = 9;

    //Algoritma
    printf("Masukkan n: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
        
            printf("%d", x);
            x = (x + 1) % (y + 1);
        }
        printf("\n");
    }

    return 0;
}
