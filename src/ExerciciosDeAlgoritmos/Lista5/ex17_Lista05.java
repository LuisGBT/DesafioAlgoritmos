package ExerciciosDeAlgoritmos.Lista5;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ex17_Lista05 {
    public static void main(String[] args) {
        //Em um restaurante Self-Service, o preço do quilo custa R$ 23,59. Crie um algoritmo que, para cada
        //cliente, leia o peso do prato e valor gasto com bebida e calcule o valor total da conta que o cliente
        //irá pagar [ valor da conta = bebida + (peso * 15) ]. Só encerre a execução quando o peso do prato
        //digitado for igual a 0 e o valor da bebida for também igual a 0.

        Scanner input = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        double precoKg = 23.59;
        double pesoPrato = 1;
        double valorBebida = 1;
        double totSoma= 0;
        int count = 0;

        while(pesoPrato != 0 && valorBebida != 0) {
            System.out.println("Qual o peso do prato? ");
            pesoPrato = input.nextDouble();

            System.out.println("Quantos gastou em bebidas? ");
            valorBebida = input.nextDouble();

            totSoma += valorBebida + (pesoPrato * precoKg);

        }

        System.out.println("Valor total a pagar é" + nf.format(totSoma));

    }
}
