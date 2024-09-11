//Nama File         : AkagiKongous.c
//Deskripsi         : Code Game looping c = A-B , dan A==B, B==C sampai kondisional menang
//Pembuat           : Gigih Haidar Falah - 24060122140150
//Tanggal Pembuatan : Rabu, 6 - 02 - 2024

#include <stdio.h>
#include <stdlib.h>

int main() {
    // Kamus
    int A; // Akagi
    int B; // Kongou
    int C;
    int Babak;
    Babak = 1;

    // Algoritma
    printf("Masukan angka yang dipilih Akagi: ");
    scanf("%d", &A);
    printf("Masukan angka yang dipilih Kongou: ");
    scanf("%d", &B);

    while (1) {
        // Hitung nilai C sebelum output
        C = A - B;

        // Output Keluaran
        printf("\nBabak %d\n", Babak);
        printf("C = %d\n", C);
        printf("Akagi = %d\n", A);
        printf("Kongou = %d\n", B);

        if (C == 0) {
            printf("Pemenangnya adalah Kongou\n");
            break;
        } else if (C < 0) {
            printf("Pemenangnya adalah Akagi\n");
            break;
        }

        Babak++;
        A = B;
        B = C;
    }

    return 0;
}
