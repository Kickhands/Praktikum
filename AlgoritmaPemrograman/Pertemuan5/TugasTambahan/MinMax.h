#ifndef MINMAX
#define MINMAX

int maxV1(int a, int b);

int minV1(int a, int b);

void maxV2(int a, int b, int *c);

void minV2(int a, int b, int *c);

int* maxV3(int *a, int *b);

int* minV3(int *a, int *b);

void swap(int *a, int *b);

void swapMaxA(int *a, int *b);

void swapMinA(int*a, int *b);

void printAddress(int *x, char s[]);

#endif