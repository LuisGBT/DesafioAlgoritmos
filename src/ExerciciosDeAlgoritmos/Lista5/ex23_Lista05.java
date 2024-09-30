package ExerciciosDeAlgoritmos.Lista5;

import java.util.Scanner;

public class ex23_Lista05 {
    public static void main(String[] args) {
        //Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de códigos. Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:
        //- 1,2,3,4 = voto para os respectivos candidatos;
        //- 5 = voto nulo;
        //- 6 = voto em branco;
        //Elabore um algoritmo que leia o código do candidado em um voto. Calcule e escreva:
        //- total de votos para cada candidato;
        //- total de votos nulos;
        //- total de votos em branco;
        //Como finalizador do conjunto de votos, tem-se o valor 0.
        
        Scanner input = new Scanner(System.in);

        int[] contagem = new int [6];
        String[] name = {"1", "2", "3", "4", "nulo", "em branco"};
        String cantidato = "";
        int voto = 1;
        int maior = Integer.MIN_VALUE;
        
        while(voto != 0){
            System.out.println("Qual codigo ira votar? ");
            voto = input.nextInt();
            
            if(voto == 1){
                contagem[0] += 1;
            } else if (voto == 2) {
                contagem[1] += 1;
            } else if (voto == 3) {
                contagem[2] += 1;
            } else if (voto == 4) {
                contagem[3] += 1;
            } else if (voto == 5) {
                contagem[4] += 1;
            } else if (voto == 6) {
                contagem[5] += 1;
            }

        }
        
    for(int i =0; i < contagem.length; i++){
        System.out.println("O codigo " + name[i] + " teve " + contagem[i] + " votos" );
    }
        for (int i =0; i < 4 ; i++){
            if(contagem[i] > maior){
                maior = contagem[i];
                cantidato = name[i];
            }
        }
        System.out.println("O candidato vencedor foi o " + cantidato + " com  " + maior + " votos");
    }
}
