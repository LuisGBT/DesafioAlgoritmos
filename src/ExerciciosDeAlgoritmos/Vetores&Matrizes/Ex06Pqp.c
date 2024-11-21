#include <stdio.h>

int main() {
        int A[10];
        int maior = -2147483647;
        int pMaior = 0;
        int menor = 2147483647;
        int pMenor = 0;
    for(int i = 0; i < 10; i++){
        scanf("%d", &A[i]);
    }

    for(int i = 0; i < 10; i++){
            if(A[i] > maior){
                maior = A[i];
                pMaior++;
            } 

            if(A[i] < menor){
                menor = A[i];
                pMenor++;
            }
    }
    printf("A maior idade é %d, e estava no indice %d\n", maior, pMaior);
    printf("A menor idade é %d, e estava no indice %d\n", menor, pMenor);
    
    return 0;
}