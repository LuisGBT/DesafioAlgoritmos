#include <stdio.h>

int main() {
    //Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar, imprimir o resultado
    //desta operação.
    int num = 0;
    printf("Insira um valor: ");
    scanf("%d", &num);

    if(num % 2 == 0){
        printf("o valor de %d + 5 é igual a: %d", num, num + 5);
    }else{
        printf("o valor de %d + 8 é igual a: %d", num, num + 8);
    }
    return 0;
}