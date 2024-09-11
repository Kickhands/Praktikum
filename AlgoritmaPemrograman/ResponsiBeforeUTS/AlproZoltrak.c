#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <stdbool.h>

bool isPrima(int i, int n){
    if (n==0 || n==1){
        return false;
    }
    else if(n == 2){
        return true;
    }
    else{
        if(n==i){
            return true;
        }
        else if(n%i==0){
            return false;
        }
        else{
            return isPrima(i+1, n);
        }
    }
}

int main() {

    // Kamus
    int n, i, temp, idxFrieren, idxHimmel;
    int *Frieren, *Himmel;
    
    // Algoritma
    scanf(" %d", &n);
    Frieren = malloc(n*sizeof(int));
    Himmel = malloc(n*sizeof(int));
    idxFrieren = 0;
    idxHimmel = 0;
    for(i=0;i<n;i++){
        scanf(" %d", &temp);
        if(temp%5==0 && temp<=150 && temp>0){
            Frieren[idxFrieren++] = temp;
        }
        else if(isPrima(2, temp) && temp<=100){
            Himmel[idxHimmel++] = temp;
        }
    }
    if(idxFrieren>0){
        printf("Frieren: ");
        for(i=0;i<idxFrieren;i++){
            printf("%d ", Frieren[i]);
        }
        printf("\n");
    }
    if(idxHimmel>0){
        printf("Himmel: ");
        for(i=0;i<idxHimmel;i++){
            printf("%d ", Himmel[i]);
        }
        printf("\n");
    }
    if(idxFrieren>idxHimmel){
        printf("Frieren menang!");
    }
    else if(idxHimmel>idxFrieren){
        printf("Himmel menang!");
    }
    else{
        printf("Seri!");
    }
    return 0;
}