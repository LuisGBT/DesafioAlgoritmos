package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex12_Lista05 {
    public static void main(String[] args) {
        //Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.

        Scanner input = new Scanner(System.in);
        int num = 0;
        int count = 0;
        int entre = 0;

        while(count < 20){
            count++;

            System.out.println("Digite um numero: ");
            num = input.nextInt();

            if(num >= 0 && num <= 100){
                entre++;
            }
        }
        System.out.println(entre + " numeros estao entre 0 e 100");
    }
}
