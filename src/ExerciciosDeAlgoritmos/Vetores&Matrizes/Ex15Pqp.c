#include <stdio.h>

int main() {
    //Escreva um programa que receba uma matriz A(6,6) e retorne a soma dos elementos da sua diagonal
    //principal
    int A[6][6];

    for(int i = 0; i < 6; i++){
        for(int x = 0; x < 6; x++){
            A[i][x] = rand(0, 99);
        }
    }

     for(int i = 0; i < 6; i++){
        for(int x = 0; x < 6; x++){
            printf("%d\n%d\n", A[i][x]);
        }
    }
    
    return 0;
}