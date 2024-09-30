package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex21_Lista05 {
    public static void main(String[] args) {
        //Um viajante decidiu se aventurar e percorrer toda a BR 101 de carro a partir do quilômetro 0 até
        //ultrapassar o quilômetro 4000, parando em várias cidades durante o percurso. Crie um algoritmo
        //que, em cada cidade que o viajante parar, leia a informação da quilometragem percorrida e adicione
        //ao valor da quilometragem total. Encerre o algoritmo quando o valor da quilometragem total
        //percorrida for igual ou ultrapassar os 4000 km.

        Scanner input = new Scanner(System.in);

        int totKm = 4000;
        int qtdPercorrido = 0;
        int count = 0;


        while(count <= totKm){
            count++;

            if(count == 450){
                qtdPercorrido += 450;
                System.out.println("motorista parou na primeira cidade e percorreu " + qtdPercorrido + "KM");
            }

            if(count == 950){
                qtdPercorrido += 950;
                System.out.println("motorista parou na segunda cidade e percorreu " + qtdPercorrido + "KM");
            }

            if(count == 1560){
                qtdPercorrido += 1560;
                System.out.println("motorista parou na terceira cidade e percorreu " + qtdPercorrido + "KM");
            }

            if(count == 2400){
                qtdPercorrido += 1200;
                System.out.println("motorista parou na quarta cidade e percorreu " + qtdPercorrido + "KM");
            }

        }
        System.out.println("Total percorrido " + qtdPercorrido + "KM");

    }
}
