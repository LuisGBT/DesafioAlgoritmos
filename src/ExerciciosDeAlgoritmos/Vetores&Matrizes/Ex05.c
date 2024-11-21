#include <stdio.h>
#include <locale.h>
int main()
{
  setlocale(LC_ALL, "Portuguese");
  // Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva:
  //a) a soma de elementos armazenados neste vetor que sa?o inferiores a 15;
  //b) a quantidade de elementos armazenados no vetor que sa?o iguais a 15;
  //c) a me?dia dos elementos armazenados no vetor que sa?o superiores a 15.

  Ex05();
  
}

void Ex05(){
    int A[10];
    int igual15 = 0;
    double maior15 = 0;
    double tot = 0;
    double media = 0;

    for(int i = 0; i < 10; i++){
        scanf("%d", &A[i]);
    }
    
    for(int i = 0; i < 10; i++){
        for(int c = 9; c > 0; c--){  
            if(A[i] + A[c] < 15){
                printf("A soma de %d + %d é %d\n", A[i], A[c], A[i] + A[c]);   
             }
            }
        
            if(A[i] == 15){
                igual15++;            
            }
        
            if(A[i] > 15){
                maior15++;
                tot = tot + A[i];
            }    
    }
    
    media = (tot/maior15);
    printf("O total de numeros iguais a 15 é %d\n", igual15);
    printf("A media de valores superiores a 15 é %.2f\n", media);
    
}

