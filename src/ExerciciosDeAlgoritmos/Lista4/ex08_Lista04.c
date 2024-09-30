#include <stdio.h>

int main() {
    char civil;

    printf("S, C, V, D, d\n");
    scanf("%1s", &civil);


    switch (civil) {
        case 'S':
            printf("Solteiro");
            break;
        case 'C':
            printf("Casado");
            break;
        case 'V':
            printf("Viuvo");
            break;
        case 'D':
            printf("Divorciado");
            break;
         case 'd':
             printf("Desquitado");
            break;
        default:
             printf("Opçao invalida");
            break;
            
    }
    return 0;
}