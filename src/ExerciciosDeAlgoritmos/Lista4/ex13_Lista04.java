package ExerciciosDeAlgoritmos.Lista4;

import java.util.Scanner;

public class ex13_Lista04 {
    public static void main(String[] args) {
        int numConta = 12345;
        String nome;
        double operacao = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome? \n");
        nome = sc.nextLine();

        System.out.println("Qual operaçao deseja realizar na sua conta? \n" +
                            "1 deposito\n" +
                            "2 saque\n");
        int op = sc.nextInt();

        switch (op){
            case 1:
                System.out.println("Quantos deseja depositar? \n");
                operacao = sc.nextDouble();
              double saldo =+ operacao;
                System.out.println("Seu saldo atual é R$" + saldo);
                break;
            case 2:
                System.out.println("Quantos deseja sacar? \n");
                operacao = sc.nextDouble();
                saldo =- operacao;
                System.out.println("Seu saldo atual é R$" + saldo);
                break;
            default:
                System.err.println("Operacao Invalida!!\n");
                break;
        }


    }

}
