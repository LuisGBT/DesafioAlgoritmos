#include <stdio.h>

int main() {
    int opcao = 0;
    float valorVenda = 0;

    printf("Qual valor total da compra? ");
    scanf("%f", &valorVenda);

    printf("Qual a forma de pagamento? \n1-Venda a Vista\n2-Venda a Prazo 30 dias\n3-Venda a Prazo 60 dias\n4-Venda a Prazo com 90 dias\n5-Venda com cartão de débito\n6-Venda com cartão de crédito\n");
    scanf("%d", &opcao);

    switch(opcao){
        case 1:
            printf("Venda a Vista - desconto de 10porCento\n");
            printf("De R$%.2f ficara apenas R$%.2f", valorVenda, valorVenda - ((valorVenda * 10 )/ 100));
            break;
        case 2:
            printf("Venda a Prazo 30 dias - desconto de 5porCento\n");
            printf("De R$%.2f ficara apenas R$%.2f", valorVenda, valorVenda - ((valorVenda * 5 )/ 100));
            break;
        case 3:
            printf("Venda a Prazo 60 dias - mesmo preço \n");
            printf("Valor total a pagar: R$%.2f", valorVenda);
            break;
        case 4:
            printf("Venda a Prazo 90 dias - acréscimo de 5porCento\n");
            printf("De R$%.2f ficara apenas R$%.2f", valorVenda, valorVenda + ((valorVenda * 5 )/ 100));
            break;
        case 5:
            printf("Venda com cartão de débito - desconto de 8porCento\n");
            printf("De R$%.2f ficara apenas R$%.2f", valorVenda, valorVenda - ((valorVenda * 8 )/ 100));
            break;
        case 6:
            printf("Venda com cartão de crédito - desconto de 7poCento\n");
            printf("De R$%.2f ficara apenas R$%.2f", valorVenda, valorVenda - ((valorVenda * 7 )/ 100));
            break;
        default:
        printf("Opcao invalida!!");
            break;
    }
    return 0;
}