#include <stdio.h>

void main(){
    int num;
    printf("Digite um numero de 1 a 10 \n");
    scanf("%d", &num);
    switch (num)
    {
    case 1:
        printf("Um!");
        break;
    case 2:
        printf("Dois!");
        break;
    case 3:
        printf("Três!");
        break;
    case 4:
        printf("Quatro!");
        break;
    case 5:
        printf("Cinco");
        break;
    case 6:
        printf("Seis!");
        break;
    case 7:
        printf("Sete!");
        break;
    case 8:
        printf("Oito!");
        break;
    case 9:
        printf("Nove!");
        break;
    case 10:
        printf("Dez!");
        break;                        
    default:
        printf("Erro! Volte de digite outro numero!");
        break;
    }
    return 0;
}