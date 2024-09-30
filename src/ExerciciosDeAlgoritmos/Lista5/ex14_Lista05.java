package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex14_Lista05 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses
        //números. Encerre a execução quando um número negativo for digitado
        Scanner input = new Scanner(System.in);

        int num = 1;
        int soma = 0;

        while(num > 0){
            System.out.println("Digite um numero: ");
            num = input.nextInt();

            if(num < 0){
                break;
            }
            soma = soma + num;
        }
        System.out.println(soma);
    }
}
