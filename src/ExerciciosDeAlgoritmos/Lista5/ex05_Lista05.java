package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex05_Lista05 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia 10 números informados pelo usuário e calcule a soma desses
        //números

        Scanner input = new Scanner(System.in);

        int count = 0;
        int num = 0;
        int soma = 0;

        while (count < 10){
            count++;
            System.out.println("Digite um numero: ");
            num = input.nextInt();
            soma += num;
        }
        System.out.println(soma);
    }
}
