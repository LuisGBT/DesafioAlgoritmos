package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex18_Lista05 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia a quantidade de alunos em uma turma. Em seguida, para cada aluno,
        //leia a informação de suas 2 notas, calcule a média e informe se o aluno está aprovado ou reprovado.
        //O aluno está aprovado apenas se a sua média for maior ou igual a 6.

        Scanner input = new Scanner(System.in);

        int qtdAluno = 0;
        int count = 0;
        int nota1 = 0;
        int nota2 = 0;
        int media = 0;

        System.out.println("Qual a quantidade de alunos?");
        qtdAluno = input.nextInt();

        while(count < qtdAluno){
            count++;

            System.out.println("Qual a primeira nota? ");
            nota1 = input.nextInt();

            System.out.println("Qual a segunda nota? ");
            nota2 = input.nextInt();

            if((nota1 + nota2) / 2 >= 60){
                System.out.println("Aluno " + count + " esta aprovado");
            }else{
                System.out.println("Aluno " + count + " esta reprovado");
            }

        }
    }
}
