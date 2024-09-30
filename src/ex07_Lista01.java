public class ex07_Lista01 {
    public static void main(String[] args) {
        //Troque o conteúdo de duas variáveis.
        int var1 = 10;
        int var2 = 5;

        int var3 = var1;
        var1 = var2;
        var2 = var3;

        System.out.println("var1 = " + var1 + "; var2 = " + var2);
    }
}
