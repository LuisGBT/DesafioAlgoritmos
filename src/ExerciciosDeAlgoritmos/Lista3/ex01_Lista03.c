#include <stdio.h>

int main() {
    //Faça um algoritmo que leia dois valores A e B e imprima o maior deles.
    int A = 0;
    int B = 0;
    printf("Qual o valor de A? \n");
    scanf("%d", &A);

    printf("Qual o valor de B? \n");
    scanf("%d", &B);

    if(A > B){
        printf("O valor de A=%d é maior que B=%d", A, B);
    }else{
         printf("O valor de B=%d é maior que A=%d", B, A);
    }
    return 0;
}