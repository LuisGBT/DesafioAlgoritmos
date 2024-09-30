import java.text.DecimalFormat;
import java.util.Scanner;

public class ex08_Lista_03 {
    public static void main(String[] args) {
        //Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e
        //a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento
        //escolhida e efetuar o cálculo adequado.

        double valorProduto = 79.80;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,00.00");
        System.out.println("Qual será a forma de pagamento? \n" +
                            "[1] A vista em dinheiro ou cheque, recebe 10% de desconto\n" +
                            "[2] A vista no cartão de crédito, recebe 15% de desconto\n" +
                            "[3] Em duas vezes, preço normal de etiqueta sem juros\n" +
                            "[4] Em duas vezes, preço normal de etiqueta mais juros de 10%");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1 :
                System.out.println("Ganhara 10% de desconto de R$:"+ df.format(valorProduto ) + " ficara R$:" + df.format(valorProduto - ((valorProduto * 10) / 100)));
                break;

            case 2 :
                System.out.println("Ganhara 15% de desconto de R$:"+ df.format(valorProduto ) + " ficara R$:" + df.format(valorProduto - ((valorProduto * 15) / 100)));

                break;

            case 3 :
                System.out.println("Parcelado em 2 vzs sem juros!!");
                break;

            case 4:
                System.out.println("Parcelado em mais de 2 vzs, tera um juros de 15%, ficara R$:" + df.format(valorProduto + ((valorProduto * 15) / 100)));
                break;

            default:
                System.err.println("Opcao invalida");
                break;
        }
    }
}
