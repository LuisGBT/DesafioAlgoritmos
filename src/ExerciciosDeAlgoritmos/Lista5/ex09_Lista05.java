package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex09_Lista05 {
    public static void main(String[] args) {
        //Crie um algoritmo leia um número informado pelo usuário e exiba a sua tabuada
        Scanner input = new Scanner(System.in);

        int num = 0;
        int count = 0;

        System.out.println("digite um numero: ");
        num = input.nextInt();

        while(count < 10){
            count++;
            System.out.println(num + "x" + count + " = " + num * count);
        }

    }
}
