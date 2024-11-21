#include <stdio.h>

int main() {
    //Leia um vetor de 16 posições e troque os 8 primeiros valores pelos 8 últimos e vice-e-versa. Escreva ao
    //final o vetor obtido.

    int A[16];
    int aux = 0;
    int c = 3;

    for(int i = 0; i < 16; i++)
        {
            scanf("%d", &A[i]);
        }

        for(int i = 0; i < 8; i++)
        {
            aux = A[c];
            A[c] = A[i];
            A[i] = aux;
            c--;
        }
        for(int i = 0; i < 16; i++)
        {
            printf("%d", A[i]);
        }

   
    
    return 0;
}
