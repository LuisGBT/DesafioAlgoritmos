import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class HotPao {
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
        double qtdPaos = sc.nextInt();
        qtdPaos = valorPao * qtdPaos;

        System.out.println("Quantas broas deseja comprar: ");
        double qtdBroa = sc.nextInt();
        qtdBroa = valorBroa * qtdBroa;

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("A padaria HotPao arrecadou no dia de hoje: R$:"+ df.format(qtdPaos + qtdBroa) );

        System.out.println("HotPao deve guardar na na poupança o valor de: R$:" + df.format((qtdPaos + qtdBroa) / 10));

        sc.close();




    }
}
