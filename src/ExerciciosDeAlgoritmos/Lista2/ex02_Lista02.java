package ExerciciosDeAlgoritmos.Lista2;

import java.util.Scanner;
public class ex02_Lista02 {
        public static void main(String[] args) {
            //Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos
            //comprados para um haras.

            Scanner sc = new Scanner(System.in);
            System.out.println("Quantos cavalos ira comprar? ");
            int cavalos = sc.nextInt();

            System.out.println("Voce precisara comprar "+ cavalos * 4 +" ferraduras");

            sc.close();
        }
    }

