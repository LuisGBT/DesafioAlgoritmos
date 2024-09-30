package ExerciciosDeAlgoritmos.Lista5;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ex16_Lista05 {
    public static void main(String[] args) {
        //Escreva um algoritmo que simule o funcionamento de um caixa de supermercado. O seu algoritmo
        //deve receber do a informação de quantos produtos o cliente comprou e, para cada produto, deverá
        //ler o seu preço. Ao final, deverá informar quanto o cliente deve pagar pelas compras.

        Scanner input = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "br"));

        int qtdProdutos = 0;
        double soma = 0;
        double preco = 0;
        int count = 0;

        System.out.println("Quantos produtos comprou? ");
        qtdProdutos = input.nextInt();


        while (count < qtdProdutos) {
            count++;
            System.out.println("Qual preco do " + count + " produto?");
            preco = input.nextDouble();

            soma += preco;
        }

        System.out.println("Valor total da compra: " + nf.format(soma));
    }
}
