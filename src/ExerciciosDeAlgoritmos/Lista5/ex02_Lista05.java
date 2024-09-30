package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex02_Lista05 {
    public static void main(String[] args) {
        //Escreva um algoritmo que calcule o somatório dos números de um intervalo informado pelo usuário.
        Scanner input = new Scanner(System.in);

        int soma = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite outro valor: ");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            while ((num1 < num2)) {
                num1++;
                int resultado = soma + num1;
                System.out.println(resultado);
            }
        }else{
            while ((num2 < num1)) {
                num2++;
                int resultado = soma + num2;
                System.out.println(resultado);
            }
        }
    }
}
