#include <stdio.h>

int main() {
    //Leia 3 vetores de 9 posições e crie outro com o 1º terço do primeiro, o segundo 3º. do segundo e o
    //ultimo terço do 3º. Escrever o vetor resultante ao final.

    int A[9];
    int B[9];
    int C[9];
    int RES[9];
    int x = 0;
    int y = 0;

    for(int i = 0; i < 9; i++){
        scanf("%d", &A[i]);
        scanf("%d", &B[i]);
        scanf("%d", &C[i]);
    }

     for(int i = 0; i < 3; i++){ 
            RES[x] = A[i];
            x++;
        }

        for(int i = 4; i < 6; i++){
            RES[x] = B[i];
            x++;
        }

        for(int i = 7; i < 9; i++){
            RES[x] = C[i];
            x++;
        }

        for(int i = 0; i < 9; i++){
            printf("%d\n", RES[i]);
        }

   
    return 0;
}