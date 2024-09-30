#include <stdio.h>

int main() {
    //Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar.
    int num = 0;
    
    printf ("Digite um numero: ");
    scanf("%d", &num);
    
        if(num % 2 == 0){
        printf ("%d é par", num);
        }else{
        printf ("%d é impar", num);
        }
    return 0;
}