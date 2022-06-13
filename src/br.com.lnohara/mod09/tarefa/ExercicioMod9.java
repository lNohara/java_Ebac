package br.com.lnohara.mod09.tarefa;

import java.util.Scanner;

public class ExercicioMod9 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Informe um número com ponto flutuante. EX: 2,5: ");
        float n1 = sc.nextFloat();

        Float n2 = n1;
        System.out.println("Wrapper - Float: " + n2);

        int n3 = (int) n1;
        System.out.println("Cast explicito com perda do ponto flutuante: " + n3);
    }
}
