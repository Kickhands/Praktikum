//Nama File         : AlproAngkaKuat.c
//Deskripsi         : Cursed
//Pembuat           : Gigih Haidar Falah - 24060122140150
//Tanggal Pembuatan : 

#include <stdio.h>
#include <stdlib.h>

int factorial(int n) {
    if (n <= 1)
        return 1;
    else
        return n * factorial(n - 1);
}

int isStrong(int num) {
    int originalNum = num;
    int sum = 0;

    while (num > 0) {
        int digit = num % 10;
        sum += factorial(digit);
        num /= 10;
    }

    if (sum == originalNum)
        return 1; 
    else
        return 0; 
}

int main() {
    int n;
    scanf("%d", &n);
    if (isStrong(n))
        printf("KUAT\n");
    else
        printf("lemah\n");

    return 0;
}