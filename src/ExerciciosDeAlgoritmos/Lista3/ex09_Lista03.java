package ExerciciosDeAlgoritmos.Lista3;

import java.util.Scanner;

public class ex09_Lista03 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia o número de identificação do aluno, 3 notas obtidas e calcule a média aritmética
        //obtida pelo aluno. Ao final informe se o aluno foi aprovado direto, ficou em recuperação ou foi reprovado por nota.

        int id = 0;
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu numero de identificação? ");
        id = sc.nextInt();

        System.out.println("Qual o valor da sua nota1? ");
        nota1 = sc.nextInt();

        System.out.println("Qual o valor da sua nota2? ");
        nota2 = sc.nextInt();

        System.out.println("Qual o valor da sua nota3? ");
        nota3 = sc.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;

        if(media >= 70){
            System.out.println("Parabéns!! esta aprovando com " + media + " de nota");
        } else if(media < 60 ) {
            System.err.println("HAHAHAHA voce esta em REPROVADO com " + media + " de nota");
        }else{
            System.out.println("Atenção!! voce esta em recuperação com " + media + " de nota");
        }
    }
}
