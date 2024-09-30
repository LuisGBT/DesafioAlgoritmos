package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex11_Lista05 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia 20 números informados pelo usuário e exiba quantos números são
        //pares

        Scanner input = new Scanner(System.in);
        int num = 0;
        int count = 0;
        int pares = 0;

        while(count < 20){
            count++;
            System.out.println("Digite um numero: ");
            num = input.nextInt();

            if(num % 2 == 0){
                pares++;
            }
        }
        System.out.println(pares + " sao pares");
    }
}
