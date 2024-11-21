#include <stdio.h>
#include <locale.h>
int main()
{
  setlocale(LC_ALL, "Portuguese");
  //Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada
  //elemento de C é a soma dos respectivos elementos em A e B, ou seja:
  //C[i] = A[i] + B[i].

  Ex04();
  
}

void Ex04(){
  int A[10];
  int B[10];
  int C[10];

  for(int i = 0; i < 10; i++){
    printf("Digite um numero: \n");
    scanf("%d", &A[i]);

    printf("Digite outro numero: \n");
    scanf("%d", &B[i]);

    C[i] = A[i] + B[i];
    printf("O valor de %d + %d = %d\n", A[i], B[i], C[i]);

  }
}

