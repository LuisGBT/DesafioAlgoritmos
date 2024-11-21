#include <stdio.h>

int main() {
    //Leia um vetor de 10 posições e verifique se existem valores iguais e os escreva

    int A[10];
    int x = 0;
    int y = 0;

    for(int i = 0; i < 10; i++){
        scanf("%d", &A[i]);
    }

    for(int i = 0; i < 10; i++){
        x = A[i];

        while(y < 10){

            if(A[y] == x){
                printf("o valor da posicao %d e igual a posicao %d: %d = %d\n", i, y, A[i], A[y]);
            }
            y++;
        }
        y = 0;
    }
    return 0;
}