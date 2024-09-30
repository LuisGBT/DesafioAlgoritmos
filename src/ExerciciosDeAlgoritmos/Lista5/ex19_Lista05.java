package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex19_Lista05 {
    public static void main(String[] args) {
        //Uma loja de animais vende gatos e cachorros. Escreva um algoritmo que leia a quantidade de
        //animais da loja e, para cada animal, leia a informação do tipo do animal (se é gato ou cachorro). Ao
        //final, exiba a quantidade de animais que são gatos e a quantidade de animais que são cachorros
        //existentes na loja

        Scanner input = new Scanner(System.in);

        int qtdTot = 0;
        int qtdGato = 0;
        int qtdCachorro = 0;
        String tipo;
        int count = 0;

        System.out.println("Qual a quantidade da animais na loja?");
        qtdTot = input.nextInt();

        while(count < qtdTot){
            count++;

            System.out.println("Qual é o tipo do animal " + count + "?");
            tipo = input.next();

            if(tipo.equals("gato")){
                qtdGato++;
            } else if (tipo.equals("cachorro")){
                qtdCachorro++;

            }else{
                System.err.println("Tipo invalido!!");
            }
        }
        System.out.println("A quantidade de gatos é " + qtdGato);
        System.out.println("A quantidade de cachorros é " + qtdCachorro);
    }
}
