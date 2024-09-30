package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex13_Lista05 {
    public static void main(String[] args) {
        //. Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100, quantos
        //estão entre 101 e 200 e quantos são maiores de 200.
        Scanner input = new Scanner(System.in);

        int num = 0;
        int count = 0;
        int zeroCem = 0;
        int cento1 = 0;
        int maior200 = 0;

        while(count < 20){
            count++;

            System.out.println("Digite um numero: ");
            num = input.nextInt();

            if(num >= 0 && num <= 100){
                zeroCem++;
            } else if (num >= 101 && num <= 200) {
                cento1++;
            }else{
                maior200++;
            }
        }
        System.out.println(zeroCem + " numeros entre 0 e 100");
        System.out.println(cento1 + " numeros entre 101 e 200");
        System.out.println(maior200 + " numeros maiores que 200");
    }
}
