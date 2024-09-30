// Crie um algoritmo chamado Estacoes. Este algoritmo deve ler uma data e armazenar na variável mes um número 
//entre 1 e 12, correspondendo a um dos meses do ano.

#include <stdio.h>

void main(){
    int dd,mm;
    printf("Informe o dia de hoje:\n");
    scanf("%d", &dd);
    printf("Informe o mes atual:\n");
    scanf("%d", &mm);

    switch (mm){
    case 3: case 4: case 5:
        if (dd >= 20){
            printf("Estamos na estacao do Outono!\n");
        }else{
            printf("Ainda estamos no Verao!\n");
        }
        break;
    case 6: case 7: case 8:
        if (dd >= 20){
            printf("Estamos na estacao do Inverno!\n");
        }
        else{
            printf("Ainda estamos no Outono!\n");
        }
        break;
    case 9: case 10: case 11:
        if (dd >= 22){
            printf("Estamos na estacao da Primavera!\n");
        }else{
            printf("Ainda estamos no Inverno!\n");
        }
        break;
        case 12: case 1: case 2:
        if (dd >= 21){
            printf("Estamos na estacao do Verao!\n");
        }else{
            printf("Ainda estamos na Primavera!\n");
        }
        break;
    default:
        break;
    }
    return 0;
}