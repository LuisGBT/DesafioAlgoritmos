import java.text.DecimalFormat;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        //Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o preço do
        //litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no tanque.

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a valor do litro da gasosa: ");
        double litroGasosa = sc.nextDouble();

        System.out.println("Quantos reais deseja abastecer: ");
        double reaisAbastecido = sc.nextDouble();

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Voce abasteceu: " + df.format(reaisAbastecido / litroGasosa) + " litros");

        sc.close();
    }
}
