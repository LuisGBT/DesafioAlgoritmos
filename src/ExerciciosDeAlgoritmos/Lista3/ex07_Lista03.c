#include <stdio.h>
int main()
{
    //Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal,
    //utilizando as seguintes fórmulas:
    //para homens: (72.7 * h) – 58;
    //para mulheres: (62.1 * h) – 44.7.
    
    int gen = 0;
    float h = 0;
    
    printf("Qual seu genero? 1=M ou 2=F\n");
    scanf("%d", &gen);
    
    printf("Qual sua altura?\n");
    scanf("%f", &h);
    
    if(gen == 1){
      float peso = (72.7 * h) - 58;
      printf("Seu peso ideal para o genero masculino é %.2f", peso);
    }else{
      float peso = (62.1 * h) - 44.7;
      printf("Seu peso ideal para o genero feminino é %.2f", peso);
    }
}