package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex04_Lista05 {
    public static void main(String[] args) {
        //Leia o nome de um usuário e um número N e escreva o nome dele na tela N vezes.
        Scanner input = new Scanner(System.in);
        String name;
        int num = 0;
        int count = 0;

        System.out.println("Qual é seu nome? ");
        name = input.nextLine();

        System.out.println("Insira um numero");
        num = input.nextInt();

        while(count != num){
            count++;
            System.out.println(count + " " + name);
        }
    }
}
