import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        //Construa um algoritmo para calcular a distância entre dois pontos do plano cartesiano. Cada ponto é um
        //par ordenado (x,y).

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero x1");
        double x1 = sc.nextDouble();

        System.out.println("Digite o numero x2");
        double x2 = sc.nextDouble();

        System.out.println("Digite o numero y1");
        double y1 = sc.nextDouble();

        System.out.println("Digite o numero y2");
        double y2 = sc.nextDouble();

        double res = Math.pow(x1 -  x2, 2) + Math.pow(y1 - y2, 2);
        System.out.println(res);

    }
}
