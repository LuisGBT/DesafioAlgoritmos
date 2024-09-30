package ExerciciosDeAlgoritmos.Lista2;

import java.util.Scanner;

public class ex09_Lista02 {
    public static void main(String[] args) {
        //Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida
        //respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a quantidade de
        //camisetas pequenas, médias e grandes referentes a uma venda, e a máquina informe quanto será o valor
        //arrecadado.

        char tamanhoCamiseta = ' ';
        int qtdCamiseta = 0;
        int[] ValorTotP = {10,12,15};
        String continuar = "";

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Qual tamanho de camiseta deseja comprar? \n " +
                    "P  M  G");
            tamanhoCamiseta = scan.next().charAt(0);

            switch (tamanhoCamiseta){
                case 'P':
                    System.out.println("Quantas camisetas P deseja comprar? ");
                    qtdCamiseta = scan.nextInt();
                    ValorTotP[0] = ValorTotP[0] * qtdCamiseta;
                    break;

                case 'M':
                    System.out.println("Quantas camisetas M deseja comprar? ");
                    qtdCamiseta = scan.nextInt();
                    ValorTotP[1] = ValorTotP[1] * qtdCamiseta;
                    break;

                case 'G':
                    System.out.println("Quantas camisetas G deseja comprar? ");
                    qtdCamiseta = scan.nextInt();
                    ValorTotP[2] = ValorTotP[2] * qtdCamiseta;
                    break;
            }

            System.out.println("Deseja continuar as compras?  SIM ou NAO");
            continuar = scan.nextLine();

            if(continuar.equals("NAO")){
                break;
            }

        }while (continuar.equals("SIM"));


        System.out.println("Venda Total: " + ValorTotP[0] + ValorTotP[1] + ValorTotP[2]);

    }
}
