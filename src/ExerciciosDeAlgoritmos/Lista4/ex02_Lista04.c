#include <stdio.h>
#include <math.h>

int main() {
    float num = 0;
    int opcao = 0;
    printf("Digite um valor real: \n");
    scanf("%f", &num);

    printf("Escolha um operação: \n1 - Raiz quadrada\n2 - A metade\n3 - 10porCento do numero\n4 - O dobro\n");
    scanf("%d", &opcao);

    switch(opcao){
        case 1:
            printf("A raiz quadrada de %.2f é igual a: %.2f", num, sqrt(num));
            break;
        case 2:
            printf("A metade de %.2f é igual a: %.2f", num, num / 2);
            break;
        case 3:
            printf("10porCento de %.2f é igual a: %.2f", num, (num * 10) / 100);
            break;
        case 4:
            printf("O dobro de %.2f é igual a: %.2f", num, num + num);
            break;
        default:
            printf("Opçao invalida!!");
            break;
    }
    return 0;
}