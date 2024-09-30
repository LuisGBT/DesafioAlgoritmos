import java.text.DecimalFormat;

public class ex02_Lista01 {
    public static void main(String[] args) {
        //Calcular a média entre 3 números reais
        double n1 = 3.14;
        double n2 = 7.04;
        double n3 = 15.15;

        double media = (n1 + n2 + n3) / 3;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("A media entre: " + n1 + " + " + n2 + " + " + n3 + " = " + df.format(media));
    }
}
