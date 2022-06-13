package br.com.lnohara.mod08;

public class Aula3 {
    public static void main(String[] args) {
        operacoesAritmeticas();
        operacoesAtribuicoes();
        operacoesIncrementoDecremento();
        oepracoesRelacionais();
    }

    private static void oepracoesRelacionais() {
        System.out.println("*** oepracoesRelacionais ***");
        int num1 = 10;
        int num2 = 20;

        boolean isMaior = num1 > num2;
        System.out.println(num1 + " é maior que " + num2 + ": " + isMaior);

        boolean isMenor = num1 < num2;
        System.out.println(num1 + " é menor que " + num2 + ": " + isMenor);

        boolean isIgual = num1 == num2;
        System.out.println(num1 + " é igual a " + num2 + ": " + isIgual);

        boolean isDiferente = num1 != num2;
        System.out.println(num1 + " é diferente de " + num2 + ": " + isDiferente);

        boolean isMaiorOuIgual = num1 >= num2;
        System.out.println(num1 + " é maior ou igual a " + num2 + ": " + isMaiorOuIgual);

        boolean isMenorOuIgual = num1 <= num2;
        System.out.println(num1 + " é menor ou igual a " + num2 + ": " + isMenorOuIgual);

        boolean isDentro = num1 >= 1 && num1 <=10;
        System.out.println(num1 + " está entre 1 e 10: "  + isDentro);

        boolean ou = num1 == 10 || num1 == 20;
        System.out.println(num1 + " é igual a 10 ou 20: "  + ou);

        boolean isNot = num1 <= 3;
        System.out.println(num1 + " É menor ou igual a 3 "  + isNot);
    }


    public static void operacoesAritmeticas(){
        System.out.println("*** operacoesAritmeticas ***");
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        System.out.println("Num3: " + num3);

        int num4 = num1 - num2;
        System.out.println("Num4: " + num4);

        int num5 = num2 / num1;
        System.out.println("Num5: " + num5);

        int num6 = num1 % num2;
        System.out.println("Num6: " + num6);

        int num7 = num1 * num2;
        System.out.println("Num7: " + num7);
    }

    public static void operacoesAtribuicoes(){
        System.out.println("*** operacoesAtribuicoes ***");
        // atribuição
        int num1 = 0;
        System.out.println(num1);

        int num2 = 10;
        int num3 = num1 + num2;
        System.out.println(num3);
        num3 += num3;
        System.out.println(num3);
    }

    public static void operacoesIncrementoDecremento(){
        System.out.println("*** operacoesIncrementoDecremento ***");

        int num1 = 10;
        System.out.println(num1);
        num1 ++;
        System.out.println(num1);
        num1 += 4;
        System.out.println(num1);

        num1 --;
        System.out.println(num1);

        num1 -= 2;
        System.out.println(num1);
    }
}
