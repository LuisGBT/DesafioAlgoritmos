import java.text.DecimalFormat;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        //A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as dimensões de
        //um terreno e depois exibir a área do terreno.

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a largura do terreno? ");
        double largura = sc.nextDouble();

        System.out.println("Qual o comprimento do terreno? ");
        double comprimento = sc.nextDouble();

        DecimalFormat df = new DecimalFormat("##,##0");
        System.out.println("A area do terreno é de: " + df.format(comprimento * largura) + " m2");
    }
}
