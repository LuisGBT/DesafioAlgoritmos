package ExerciciosDeAlgoritmos.Lista5;

public class ex01_Lista05 {
    public static void main(String[] args) {
        //Escreva um algoritmo que exiba 20 vezes a mensagem informando qual vez está sendo escrita:
        //“Esta é a mensagem 1”, “Esta é a mensagem 2” ... “Esta é a mensagem 20”
        int count = 0;

        while(count < 20){
            count++;
            System.out.println("Esta é a mensagem " + count);
        }
    }
}
