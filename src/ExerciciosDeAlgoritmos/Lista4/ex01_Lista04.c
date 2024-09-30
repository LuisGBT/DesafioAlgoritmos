#include <stdio.h>
int main()
{
  char nome[10];
  int idade = 0;
   printf("Qual seu nome?\n");
   scanf("%10s", &nome);
   
   printf("Qual a sua idade? \n");
   scanf("%d", &idade);
   
   
   switch(idade){
     case 5 :
     case 6 :
     case 7 :
     case 8 :
     case 9 :
     case 10 :
      printf("%10s voce esta na categoria infantil com %d anos", nome, idade);
      break;
     
     case 11:
     case 12:
     case 13:
     case 14:
     case 15:
       printf("%10s voce esta na categoria juvenil com %d anos", nome, idade);
       break;
       
     case 16: 
     case 17: 
     case 18: 
     case 19: 
     case 20: 
        printf("%10s voce esta na categoria junior com %d anos", nome, idade);
        break;
        
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
        printf("%10s voce esta na categoria profissional com %d anos", nome, idade);
        break;
        
      default:
        printf("Categoria Invalida!");
        break;
   }
   
   
    
    
    return 0;
}