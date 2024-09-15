import java.util.Scanner;

public class ex05_Lista01 {
    public static void main(String[] args) {
        //Calcule a média ponderada entre 3 notas. Solicite as notas e os pesos.
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor da nota 1: ");
        int nota1 = sc.nextInt();

        System.out.println("Valor da nota 2: ");
       int nota2 = sc.nextInt();

        System.out.println("Valor da nota 3: ");
        int nota3 = sc.nextInt();

        System.out.println("Valor do peso 1: ");
        int  peso1 = sc.nextInt();

        System.out.println("Valor do peso 2: ");
        int peso2 = sc.nextInt();

        System.out.println("Valor do peso 3: ");
        int  peso3 = sc.nextInt();

        int res1 = nota1 * peso1;
        int res2 = nota2 * peso2;
        int res3 = nota3 * peso3;

        int somaP = peso1 + peso2 + peso3;

        int mediaP = (res1 + res2 + res3) / somaP;
        System.out.println("A media ponderada é igual a: " + mediaP);

    }
}
