import java.util.Scanner;

public class ex10_Lista03 {
    public static void main(String[] args) {
        //Elabore um algoritmo que leia dois números inteiros e mostre o resultado da diferença do maior valor pelo menor;
        int n1 = 0;
        int n2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o primeiro numero? ");
        n1 = sc.nextInt();

        System.out.println("Qual o segundo numero? ");
        n2 = sc.nextInt();

        if(n1 > n2){
            System.out.println("A diferenca entre "+ n1 + " e " + n2 + " é = " + (n1 - n2));
        }else{
            System.out.println("A diferenca entre "+ n2 + " e " + n1 + " é = " + (n2 - n1));
        }
    }
}
