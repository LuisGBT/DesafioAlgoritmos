import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        //A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia.
        //Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou
        //com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total
        //arrecadado). Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um
        //algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.

        double valorPao = 0.12;
        double valorBroa = 1.50;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos paes deseja comprar: ");
        double qtdPaes = sc.nextInt();

        System.out.println("Quantas broas deseja comprar: ");
        double qtdBroas = sc.nextInt();

        double valorTotPao = qtdPaes * valorPao;
        double valorTotBroa = qtdBroas * valorBroa;

        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Valor final do dia: R$:"+ df.format(valorTotBroa + valorTotPao) );
        System.out.println("Valor a guardar na poupanca: R$:"+ df.format(((valorTotBroa + valorTotPao) * 10) / 100) );

        sc.close();

    }
}
