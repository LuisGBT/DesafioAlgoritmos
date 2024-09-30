package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex07_Lista05 {
    public static void main(String[] args) {
        //Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade
        Scanner input = new Scanner(System.in);

        int idade = 0;
        int count = 0;
        int countMaior = 0;

        while(count < 20){
            count++;
            System.out.println("Qual a sua idade? ");
            idade = input.nextInt();

            if(idade >= 18){
                countMaior++;
            }
        }
        System.out.println(countMaior);
    }
}
