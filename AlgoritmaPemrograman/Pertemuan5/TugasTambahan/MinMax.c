#include <stdio.h>

#ifndef MINMAX
#define MINMAX

int maxV1(int a, int b) {
    //KamusLokal

    //Algoritma
    if (a >= b) {
        return a;
    }else{
        return b;
    }
}

int minV1 (int a, int b){
    //KamusLokal

    //Algoritma
    if (a <= b) {
        return a;
    } else {
        return b;
    }
}

void maxV2 (int a, int b, int *c) {
    //KamusLokal

    //Algoritma
    if (a>=b) {
        *c = a;
    }else{
        *c =b;
    }
}

void minV2 (int a, int b, int *c) {
    //KamusLokal

    //Algoritma
    if (a<= b) {
        *c = a;
    }else{
        *c = b;
    }
}

int* maxV3(int *a, int *b) {
    //KamusLokal

    //Algoritma
    if ( *a >= *b) {
        return a;
    } else {
        return b;
    }
}

int* minV3(int *a, int *b){
    //KamusLokal
    //Algoritma
    if (*a <= *b) {
        return a;
    } else {
        return b;
    }
}

void swap(int *a, int *b){
    //KamusLokal
    int temp;
    //Algoritma
    temp = *a;
    *a = *b;
    *b = temp;
}

void swapMaxA ( int *a, int *b){
    //KamusLokal

    //Algoritma
    if (*a < *b) {
        swap(a,b);
    }
}

void swapMinA ( int *a, int *b) {
    //KamusLokal

    //Algoritma
    if (*a > *b);{
        swap(a,b);
    }    
}

void printAddress(int *x, char s[]){
    printf("Address dari %a adalah %X dengan nilai %d\n", s, x, *x);
}

#endif