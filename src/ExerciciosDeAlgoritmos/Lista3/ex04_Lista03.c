#include <stdio.h>

int main() {
    //Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.
    int num = 0;
    printf("Digite um numero: ");
    scanf("%d", &num);

    if(num > 0){
        printf("O dobro de %d é igual a %d", num, num + num);
    }else{
         printf("O triplo de %d é igual a %d", num, num + num + num);
    }

    return 0;
}