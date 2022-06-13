package br.com.lnohara.mod08.tarefa;

import java.util.Scanner;

public class AtividadeMod8 {

    /**
     * Calcula a média dos quatro valores passados
     * como argumento do método
     *
     * @param nota1 valor da primeira nota
     * @param nota2 valor da segunda nota
     * @param nota3 valor da terceira nota
     * @param nota4 valor da quarta nota
     */
    public static void calculaMedia(double nota1, double nota2, double nota3, double nota4){
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A media de: " + nota1 + ", " + nota2 + ", " + nota3 + " e " + nota4 + " é:");
        System.out.println(String.format("%.2f", media));
    }

    /**
     * Solicita o input de 4 floats
     * Calcula a média dos valores informados
     * @autor Renata Nohara
     */
    public static void calculaMedia2 (){
        Scanner sc= new Scanner(System.in);
        System.out.print("Informe o valor da primeira nota: ");
        float n1 = sc.nextFloat();
        System.out.print("Informe o valor da segunda nota: ");
        float n2 = sc.nextFloat();
        System.out.print("Informe o valor da terceira nota: ");
        float n3 = sc.nextFloat();
        System.out.print("Informe o valor da quarta nota: ");
        float n4 = sc.nextFloat();
        float media=(n1+n2+n3+n4)/4;
        System.out.println("Média: " + String.format("%.2f", media));
    }

    public static void main(String[] args) {
        calculaMedia(10, 10, 5.0, 5.5);
        System.out.println("**************************");
        calculaMedia2();
    }
}
