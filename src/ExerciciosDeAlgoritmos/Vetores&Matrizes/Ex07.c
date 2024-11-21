#include <stdio.h>

int main() {
    //Declare um vetor de 10 posições e o preencha com os 10 primeiros números impares e o escreva.

    Ex07();
    
    return 0;
}

void Ex07(){
int A[10];

    for(int i = 0; i < 10; i++){
        printf("Digite um numero: \n");
        scanf("%d", &A[i]);

        if(A[i] % 2 == 0){
            printf("Apenas numeros impares, tente dnv:\n");
            scanf("%d", &A[i]);
        }
        
    }
    for(int i = 0; i < 10; i++){
        printf("%d\n", A[i]);
    }
}