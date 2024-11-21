#include <stdio.h>

int main() {
    //Leia dois vetores de 20 posições e calcule um outro vetor contendo, nas posições pares os valores do
    //primeiro e nas posições ímpares os valores do segundo.

    int A[5];
    int B[5];
    int res[5];
    int i = 0;

    for(i = 0; i < 5; i++){
        printf("Digite um numero: \n");
        scanf("%d", &A[i]);

        printf("Digite outro numero: \n");
        scanf("%d", &B[i]);

        if(i % 2 == 0){
            res[i] = A[i];
        }else{
            res[i] = B[i];
        }
       
    }
    for(int i = 0; i < 5; i++){
        printf("Vetor A posicao %d valor %d\n", i, A[i]);
        printf("Vetor B posicao %d valor %d\n", i, B[i]);
        printf("Vetor res posicao %d valor %d\n", i, res[i]);
    }

    return 0;
}