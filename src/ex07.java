import java.util.InputMismatchException;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        //Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o início

        int dia = 0;
        int mes = 0;
        Scanner sc =new Scanner(System.in);

        try{
            System.out.println("Digite uma data dd/mm: ");
            dia = sc.nextInt();
            System.out.printf("");
            mes = sc.nextInt();

            if (dia > 30|| mes > 12){
                System.err.println(" ERRO!! data invalida");
            }else {
                int res = mes * 30 - 30 + dia;
                System.out.println("Se passou: " + res + " dias");
            }


        }catch (InputMismatchException e){
            System.err.println(e +" ERRO!! insira uma data dd/mm");
        }
    }
}
