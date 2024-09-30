package ExerciciosDeAlgoritmos.Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex08_Lista02 {
    public static void main(String[] args) {
        int qtd = 3;
        double[] notas = new double[qtd];
        double[] pesos = {1, 2, 3};
        double[] calcNotas = {0, 0, 0};
        double somaNotas = 0;
        double somaPesos = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Primeira nota: ");
        notas[0] = sc.nextDouble();

        System.out.println("Segunda nota: ");
        notas[1] = sc.nextDouble();

        System.out.println("Terceira nota: ");
        notas[2] = sc.nextDouble();

        for (int i = 0; i < qtd; i++) {
            calcNotas[i] = notas[i] * pesos[i];
        }

        somaNotas = calcNotas[0] + calcNotas[1] + calcNotas[2];
        somaPesos = pesos[0] + pesos[1] + pesos[2];

        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println("A media ponderada é: " + df.format(somaNotas / somaPesos));


    }
}
