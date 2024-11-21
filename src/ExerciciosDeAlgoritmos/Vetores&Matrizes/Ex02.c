#include <stdio.h>
#include <locale.h>
int main()
{
  setlocale(LC_ALL, "Portuguese");
  //Crie um programa que leia um vetor de 20 posições e informe:
  //a) Quantos números pares existem no vetor
  //b) Quantos números ímpares existem no vetor
  //c) Quantos números maiores do que 50
  //d) Quantos números menores do que 7
    int res = 0;
    res =  Ex02();
  
}

int Ex02(){
  int A[20];
  int qtdPar = 0;
  int qtdImpar = 0;
  int qtdMaiorQ50 = 0;
  int qtdMenorQ7 = 0;

  for(int i = 0; i < 20; i++){
    printf("Digite um numero: \n");
    scanf("%d", &A[i]);

    if(A[i] % 2 == 0){
       qtdPar++; 
    }

    if(A[i] % 2 != 0){
       qtdImpar++; 
    }

    if(A[i] > 50){
       qtdMaiorQ50++;
    }

    if(A[i] < 7){
       qtdMenorQ7++;
    }
  }
  printf("%d numeros pares\n", qtdPar);
  printf("%d numeros impares\n", qtdImpar);
  printf("%d numeros maiores que 50\n", qtdMaiorQ50);
  printf("%d numeros menores que 7\n", qtdMenorQ7);
  return 0;
}


