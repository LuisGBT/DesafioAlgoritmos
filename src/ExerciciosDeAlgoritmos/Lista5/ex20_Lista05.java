package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex20_Lista05 {
    public static void main(String[] args) {
        //O restaurante da questão 17 realiza reservas de mesas através de ligações telefônicas e possui 50
        //mesas disponíveis para reserva. Dessas mesas, 25 são na área de fumantes e 25 na área de não
        //fumantes. Para cada ligação recebida, o restaurante deve verificar se a reserva é para a mesa na
        //área de fumantes ou de não fumantes e contabilizar a quantidade de mesas restantes disponíveis

        Scanner input = new Scanner(System.in);
        int totMesa = 50;
        int totMesaFumante = 0;
        int totMesaNaoFumante = 0;
        String res;

        int count = 0;

        while(count < totMesa){
            count++;

            System.out.println("Reserva para mesa de fumentes ou nao? ");
            res = input.nextLine();

            if(res.equals("mesa de fumantes") && totMesaFumante < 25){
                totMesaFumante++;
                int resto = 25 - totMesaFumante;
                System.out.println("restam " + resto + " mesas de fumante");
            }else if (res.equals("mesa de nao fumantes") && totMesaNaoFumante < 25) {
                totMesaNaoFumante++;
                int resto = 25 - totMesaNaoFumante;
                System.out.println("restam " + resto + " mesas de nao fumante");
            }else{
                System.err.println("Resposta invalida");
                break;
            }

        }
        System.out.println("Total de mesas de fumantes reservadas " + totMesaFumante);
        System.out.println("Total de mesas de nao fumantes reservadas " + totMesaNaoFumante);


    }
}
