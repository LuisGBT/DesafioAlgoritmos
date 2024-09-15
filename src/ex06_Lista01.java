import java.text.DecimalFormat;
import java.util.Scanner;

public class ex06_Lista01 {
    public static void main(String[] args) {
        //Converta metros em centímetros
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos metros deseja converter: ");
        double metro = sc.nextDouble();

        DecimalFormat df = new DecimalFormat("0");
        System.out.println(metro + "M e igual a: " + df.format(metro * 100 ) +  " CM");
    }
}
