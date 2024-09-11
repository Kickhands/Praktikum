#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

void Sorting(int arr[], int n) {
    int x,j,i;

    for (i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) { 
            continue;
        }
        x = arr[i];
        for (j = i; j > 0 && arr[j - 1] % 2 == 0; j--) {
            arr[j] = arr[j - 1];
        }
        arr[j] = x;
    }
}

int main() {
    int n,i;
    scanf("%d", &n);

    int arr[n];
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    Sorting(arr, n);

    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}