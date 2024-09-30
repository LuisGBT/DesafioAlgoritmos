package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex15_Lista05 {
    public static void main(String[] args) {
        //. Faça um algoritmo escreva a diversas vezes a pergunta “Olá tudo bem?” e leia a resposta do usuário
        //enquanto ele responde não. Só encerre a execução quando a resposta for igual a “Sim”.

        Scanner input = new Scanner(System.in);
        String res = "nao";

        while(res.equals("nao")){
            System.out.println("Ola tudo bem? ");
            res = input.nextLine();

        }
    }
}
