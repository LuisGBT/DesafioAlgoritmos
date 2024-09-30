package ExerciciosDeAlgoritmos.Lista2;

import java.util.Scanner;

public class ex04_Lista02 {
    public static void main(String[] args) {
        //Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida ela possui.
        //Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa com 19 anos possui
        //6935 dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Quantos anos voce tem? ");
        int idade = sc.nextInt();

        System.out.println(nome + " voce viveu "+ idade * 365 + " dias!!");
        sc.close();
    }
}
