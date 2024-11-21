#include <stdio.h>
#include <locale.h>
int main()
{
  setlocale(LC_ALL, "Portuguese");
  //Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os
  //elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2.

  int A[2];
  int B[2];

  for(int i = 0; i < 2; i++){
    printf("Digite um valor: \n");
    scanf("%d", &A[i]);

    B[i] = A[i] * 2;
  }
}

