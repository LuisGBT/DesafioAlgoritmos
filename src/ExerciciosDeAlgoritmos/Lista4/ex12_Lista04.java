package ExerciciosDeAlgoritmos.Lista4;

import java.util.Scanner;

public class ex12_Lista04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2;
        System.out.println("Qual operaçao deseja realzizar? \n" +
                          "1 Adiçao\n" +
                          "2 Subtração\n" +
                          "4 Multipicação\n" +
                          "5 Divisão\n");
        int op = sc.nextInt();

        switch (op){
            case 1:
                System.out.println("Informe o primeiro numero: ");
                n1 = sc.nextDouble();

                System.out.println("Informe o segundo numero: ");
                n2 = sc.nextDouble();

                System.out.println("O resultado de "+ n1 + "+" + n2 + " = " + (n1+n2));
                break;
            case 2:
                System.out.println("Informe o primeiro numero: ");
                n1 = sc.nextDouble();

                System.out.println("Informe o segundo numero: ");
                n2 = sc.nextDouble();

                System.out.println("O resultado de "+ n1 + "-" + n2 + " = " + (n1-n2));
                break;
            case 3:
                System.out.println("Informe o primeiro numero: ");
                n1 = sc.nextDouble();

                System.out.println("Informe o segundo numero: ");
                n2 = sc.nextDouble();

                System.out.println("O resultado de "+ n1 + "x" + n2 + " = " + (n1*n2));
                break;
            case 4:
                System.out.println("Informe o primeiro numero: ");
                n1 = sc.nextDouble();

                System.out.println("Informe o segundo numero: ");
                n2 = sc.nextDouble();

                System.out.println("O resultado de "+ n1 + "/" + n2 + " = " + (n1/n2));
                break;
            default:
                System.err.println("Operação Invalida!!");
                break;
        }

        sc.close();
    }
}
