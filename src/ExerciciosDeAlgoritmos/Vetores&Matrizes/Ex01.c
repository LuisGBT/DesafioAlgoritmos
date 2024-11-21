#include <stdio.h>
#include <locale.h>
int main()
{
  setlocale(LC_ALL, "Portuguese");
  //Escreva um programa que leia dois vetores de 10 posições e faça a soma dos elementos de mesmo
  //índice, colocando o resultado em um terceiro vetor. Mostre o vetor resultante.
  
  int res = 0;
  res =  Ex01();

}


int Ex01(){
    int A[10];
    int B[10];
    int res[10];

    for(int i = 0; i < 10; i++){
    printf("Digite um numero: \n");
    scanf("%d",&A[i]);

    printf("Digite um segundo numero: \n");
    scanf("%d",&B[i]);
    res[i] = A[i] + B[i];

    printf("a soma do vetor A e B na posicão %d é igual a %d\n", i, res[i]);
    
  }
  return res;
}