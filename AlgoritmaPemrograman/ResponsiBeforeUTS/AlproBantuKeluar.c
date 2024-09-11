#include <stdio.h>

int main() {
  int n, x, i, j;
  scanf("%d %d", &n, &x);

  int arr[n];
  for (i = 0; i < n; i++) {
    scanf("%d", &arr[i]);
  }

  int found = 0;

  for (i = 0; i < n; i++) {
    for (j = i + 1; j < n; j++) {
      if (arr[i] + arr[j] == x) {
        printf("%d dan %d\n", arr[i], arr[j]);
        found = 1;
      }
    }
  }

  if (!found) {
    printf("Tidak ada output");
  }

  return 0;
}