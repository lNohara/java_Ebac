package br.com.lnohara.mod09;

public class Aula3 {

    public static void main(String[] args) {
        int num1 = 10;
    /*short num 2 = num1;
    Não poderei fazer essa atribuição pois short é menor que int
    */
        short num2 = (short) num1;

        long numero64Bits = 1111111111111111111L;
        System.out.println(numero64Bits);
        int numero32Bits = (int) numero64Bits;
        System.out.println(numero32Bits);
        System.out.println("Observe a perda");

        int idade = 10;
        long idade2 = idade;
        /*long é maior que int, logo pode guardar qualquer que seja o valor de idade sem problemas;*/
    }
}
