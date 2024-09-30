package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex08_Lista05 {
    public static void main(String[] args) {
        //Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova
        Scanner input = new Scanner(System.in);

        int[] idades = new int[10];
        String[] nomes = new String[10];
        int i;
        int count = 0;
        String name = "a";
        int idade = Integer.MAX_VALUE;

       while(count < 10){
           System.out.println("Qual é seu nome?");
           nomes[count] = input.next();

           System.out.println("Qual sua idade");
           idades[count] = input.nextInt();
           count++;
       }

        for(i = 0; i < idades.length; i++){
            if(idades[i] < idade){
                name = nomes[i];
                idade = idades[i];

            }
        }
        System.out.println("Nome: " + name + " idade: " + idade);

    }
}
