package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex10_Lista05 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia 20 números informados pelo usuário e exiba quantos números são
        //maiores do que 8
        int num = 0;
        int count = 0;
        int numMaior = 0;

        Scanner input = new Scanner(System.in);

        while(count < 20){
            count++;

            System.out.println("Digite um numero");
            num = input.nextInt();

            if(num > 8){
                numMaior++;
            }
        }
        System.out.println(numMaior + " sao maiores que 8");
    }
}
