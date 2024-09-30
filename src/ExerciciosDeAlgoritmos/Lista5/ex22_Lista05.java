package ExerciciosDeAlgoritmos.Lista5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex22_Lista05 {
    public static void main(String[] args) {
        //. Foi feita uma pesquisa de canal de TV em várias casas da cidade de João Câmara. Para cada casa
        //visitada, foi preenchida uma ficha contendo o número do canal (3, 5, 8, 11 ou 13) e o número de
        //pessoas que estavam assistindo o canal naquela casa. Faça um algoritmo que:

        //a. Leia a informação da quantidade de casas participantes da pesquisa.
        //b. Receba as informações coletadas em cada uma das casas participantes da pesquisa: a
        //informação do canal que estava sendo assistido e a quantidade de pessoas que estava
        //assistindo aquele canal na casa.
        //c. Contabilize quantas pessoas estava assistindo cada canal (leve em conta a quantidade de
        //pessoas que assistia cada canal em cada casa)
        //d. Ao finalizar a leitura de todas as fichas, escreva o número do canal e sua respectiva
        //porcentagem de audiência.

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.##");

        int qtdCasa = 0;
        int canalAssistido = 0;
        int qtdPessoas = 0;
        int count = 0;
        double totPessoa = 0;

        double canal3 = 0;
        double qtdPessoas3 = 0;

        double canal5 = 0;
        double qtdPessoas5 = 0;

        double canal8 = 0;
        double qtdPessoas8 = 0;

        double canal11 = 0;
        double qtdPessoas11 = 0;

        double canal13 = 0;
        double qtdPessoas13 = 0;

        System.out.println("Quantas casas participaram da entrevista? ");
        qtdCasa = input.nextInt();

        while(count < qtdCasa){
            count++;

            System.out.println("Qual canal a casa " + count + " assiste? ");
            canalAssistido = input.nextInt();

            System.out.println("Quantas pessoas na casa " + count + " assiste o canal " + canalAssistido);
            qtdPessoas = input.nextInt();

            if(canalAssistido == 3){
                canal3++;
                qtdPessoas3 += qtdPessoas;
                totPessoa +=qtdPessoas;

            } else if (canalAssistido == 5) {
                canal5++;
                qtdPessoas5 += qtdPessoas;
                totPessoa +=qtdPessoas;
            } else if (canalAssistido == 8) {
                canal8++;
                qtdPessoas8 += qtdPessoas;
                totPessoa +=qtdPessoas;
            } else if (canalAssistido == 11) {
                canal11++;
                qtdPessoas11 += qtdPessoas;
                totPessoa +=qtdPessoas;
            } else if (canalAssistido == 13) {
                canal13++;
                qtdPessoas13 += qtdPessoas;
                totPessoa +=qtdPessoas;
            }else{
                System.err.println("Canal invalido");
            }

        }
        System.out.println("O canal 3 tem " + df.format((qtdPessoas3 / totPessoa) * 100) + "% de audiencia");
        System.out.println("O canal 5 tem " +  df.format((qtdPessoas5 / totPessoa) * 100) + "% de audiencia");
        System.out.println("O canal 8 tem " + df.format((qtdPessoas8 / totPessoa) * 100) +"% de audiencia");
        System.out.println("O canal 11 tem " + df.format((qtdPessoas11 / totPessoa) * 100) + "% de audiencia");
        System.out.println("O canal 13 tem " + df.format((qtdPessoas13 / totPessoa) * 100) +"% de audiencia");

    }
}
