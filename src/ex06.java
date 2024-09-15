import java.text.DecimalFormat;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        //O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo que leia o
        //peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a balança já
        //desconte o peso do prato.

        //Valor do kg
        double valorKg = 12.00;

        //Kg do prato cliente
        double pesoTot;

        //opcao de prato
        int opcao;

        // Gramagem das comidas
        double arroz = 0.500;
        double feijao = 0.200;
        double batata = 0.200;
        double salada = 0.150;
        double carneFrango = 0.350;
        double carneBife = 0.400;
        double maionese = 0.300;

        Scanner input = new Scanner(System.in);

        System.out.println("Bem-Vindo ao Bem-Bao!!! R$:12,00 p/kg");
        System.out.println("Qual será o cardapio de hoje?");
        System.out.println( "1 - arroz, feijao, maionese, carneFrango\n" +
                "2 - arroz, maionese, salada, carneBife\n" +
                "3 - arroz, feijao, salada, batata, carneFrango\n" +
                "4 - arroz, feijao, batata, salada, maionese, carneBife");
        opcao = input.nextInt();

        DecimalFormat df = new DecimalFormat("0.00");

        switch (opcao) {
            case 1:
                pesoTot = arroz + feijao + maionese + carneFrango;
                System.out.println("Seu prato deu: " + pesoTot + " kg");
                System.out.println("O valor total a pagar é: R$:"+ df.format( pesoTot * valorKg ));
                break;
            case 2:
                pesoTot = arroz + maionese + salada + carneBife;
                System.out.println("Seu prato deu: " + pesoTot + " kg");
                System.out.println("O valor total a pagar é: R$:"+ df.format( pesoTot * valorKg ));
                break;

            case 3:
                pesoTot = arroz + feijao + salada + batata + carneFrango;
                System.out.println("Seu prato deu: " + pesoTot + " kg");
                System.out.println("O valor total a pagar é: R$:"+ df.format( pesoTot * valorKg ));
                break;

            case 4:
                pesoTot = arroz + feijao + batata + salada + maionese + carneBife;
                System.out.println("Seu prato deu: " + pesoTot + " kg");
                System.out.println("O valor total a pagar é: R$:"+ df.format( pesoTot * valorKg ));
                break;
            default:
                System.err.println("Opçao Invalida!!");
                System.out.println("Tente novamente!");

        }
    }
}
