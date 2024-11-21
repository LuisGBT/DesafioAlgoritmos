#include <stdio.h>

int main() {
    //Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu programa deverá fazer uma busca
    //do valor de X no vetor lido e informar a posição em que foi encontrado ou se não foi encontrado.

    Ex09(2);
    return 0;
}

void Ex09(int y){
    int A[20];
    int x = y;
    int i = 0;
    int res = 0;
    int res1 = 0;

    for(i = 0; i < 20; i++){
        scanf("%d", &A[i]);
    }

    for(int i = 0; i < 20; i++){
        printf("Buscando numero..\n");
            if(A[i] == x){
                res = i;
                res1 = A[i];
                break;
               
            }
    }
         if(res1 != x){
             printf("Não foi encontrado nenhum resultado");
         }else{
             printf("Numero %d foi encontrado no indice %d", res1, res);
         }    
}