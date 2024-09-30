#include <stdio.h>

int main() {
    //Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se somar os dois, caso
    //contrário multiplique A por B. Apresente o resultado.

     int A = 0;
     int B = 0;
        
    printf("Digite o valor de A: \n");
    scanf("%d", &A);

    printf("Digite o valor de B: \n");
    scanf("%d", &B);

    if(A == B){
        printf("O resultado de A + B é igual a %d", A + B);
    }else{
         printf("O resultado de A x B é igual a %d", A * B);
    }
    return 0;
}