package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex03_Lista05 {
    public static void main(String[] args) {
        //Leia o nome do usuário e escreva o nome dele na tela 10 vezes
        Scanner input = new Scanner(System.in);
        String name;
        int count = 0;

        System.out.println("Qual é o seu nome? ");
        name = input.nextLine();

        while(count < 10){
            count++;
            System.out.println(count +" "+ name);
        }
    }
}
