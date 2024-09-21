import java.text.DecimalFormat;
import java.util.Scanner;

public class ex11_Lista03 {
    public static void main(String[] args) {
        int qtd = 0;
        double sal = 0;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,000.00");

        System.out.println("Qual seu niver de professor? \n" +
                            "[1] R$12,00 por hora/aula\n" +
                            "[2] R$17,00 por hora/aula\n" +
                            "[3] R$25,00 por hora/aula");
        int nivel = sc.nextInt();

        switch (nivel) {
            case 1:
                System.out.println("Quantas horas trabalha por semana?");
                qtd = sc.nextInt();
                sal = 12 * qtd;
                System.out.println("Por semana voce ganha R$" + df.format(sal));

                break;

            case 2:
                System.out.println("Quantas horas trabalha por semana?");
                qtd = sc.nextInt();
                sal = 17 * qtd;
                System.out.println("Por semana voce ganha R$" + df.format(sal));
                break;

            case 3:
                System.out.println("Quantas horas trabalha por semana?");
                qtd = sc.nextInt();
                sal = 25 * qtd;
                System.out.println("Por semana voce ganha R$" + df.format(sal));
                break;
            default:
                System.err.println("Opcao Invalida!!");
                break;


        }
    }
}
