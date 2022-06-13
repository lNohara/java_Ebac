package br.com.lnohara.mod10.tarefa;

import java.util.Scanner;

public class ExercicioMod10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String resposta = "";

        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Informe o valor da primeira nota: ");
            float n1 = s.nextFloat();
            System.out.print("Informe o valor da segunda nota: ");
            float n2 = s.nextFloat();
            System.out.print("Informe o valor da terceira nota: ");
            float n3 = s.nextFloat();
            System.out.print("Informe o valor da quarta nota: ");
            float n4 = s.nextFloat();

            float media = (n1 + n2 + n3 + n4) / 4;

            if (media >= 7) {
                System.out.println("Média: " + String.format("%.2f", media) + " - Aprovado:");
            } else if (media >= 5 && media < 7) {
                System.out.println("Média: " + String.format("%.2f", media) + " - Recuperação:");
            } else {
                System.out.println("Média: " + String.format("%.2f", media) + " - Reprovado:");
            }

            System.out.println("Deseja calcular a média de outro aluno?");
            System.out.print("Digite SIM para continuar: ");
            resposta = s.next();

        }while (resposta.equalsIgnoreCase("sim"));
    }
}
