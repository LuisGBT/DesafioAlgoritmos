#include <stdio.h>

int main() {
    //Leia um vetor de 40 posições. Contar e escrever quantos valores pares ele possui.

    int A[40];
    int qtdPar = 0;

    for(int i = 0; i < 40; i++){
        printf("Digite um numero: \n");
        scanf("%d", &A[i]);

        if(A[i] % 2 == 0){
            qtdPar++;
        }
    }
    printf("o vetor possui %d numeros pares", qtdPar);

    return 0;
}