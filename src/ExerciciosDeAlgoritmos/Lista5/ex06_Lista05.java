package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex06_Lista05 {
    public static void main(String[] args) {
        //Leia a idade de 20 pessoas e exiba a média das idades
        Scanner input = new Scanner(System.in);

        int idade = 0;
        int soma = 0;
        int count = 0;

        while(count != 20){
            count++;
            System.out.println("Sua idade");
            idade = input.nextInt();
            soma += idade;

        }
        System.out.println("A mediaa é "+ soma / 20);
    }
}
