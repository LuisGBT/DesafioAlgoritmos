#include <stdio.h>

int main() {
    //Leia um vetor de 10 posições armazenando a série de Fibonacci
    int A[10];
    int x = 0;
    int y = 1;

    for(int i = 2; i < 10; i++){
        A[0] = 0;
        A[1] = 1;
        A[i] = A[x] + A[y];
        x++;
        y++; 
        printf("%d\n", A[i]);
    }
    return 0;
}