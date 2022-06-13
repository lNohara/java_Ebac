package br.com.lnohara.mod10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula2 {

    public static void forEx1 (){
        System.out.println("Print numeros =0 até <= 10");
        for (int i = 0; i <= 10; i++){
            System.out.println("Linha: " + i );
        }
    }

    public static void tabuada (){
        Scanner s = new Scanner(System.in);

        System.out.print("Informe um valor para tabuada: ");
        int num = s.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + num*i);
        }

    }

    public static void breakEx(){
        for (int i = 0; i <= 100; i++){
            System.out.println("Num: " + i);
            if(i == 10){
                break;
            }
        }
    }

    public static void whileEx(){
        int i = 0;
        while (i < 2){
            System.out.println("Num: " + i);
            i++;
        }
    }

    public static void tabuadaInterativa(){
        Scanner s = new Scanner(System.in);

        System.out.print("Digite sim para continuar ");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("sim")){
            System.out.print("Entre com o valor da tuabuada: ");
            int num = s.nextInt();
            for(int i = 0; i <= 10; i++){
                System.out.println(num + " X " + i + " = " + num*i);
            }

            System.out.println("Deseja gerar um nova tabuada?");
            System.out.print("Digite sim para continuar: ");
            resposta = s.next();
        }
        System.out.println("Obrigado.");
    }

    public static void doWhile(){
        Scanner s = new Scanner(System.in);

        String resposta = "";
        do{
            System.out.print("Digite um valor para tabuada: ");
            int num = s.nextInt();
            for(int i = 0; i <= 10; i++){
                System.out.println(num + " X " + i + " = " + num*i);
            }

            System.out.print("Deseja gerar uma nova tabuada? ");
            resposta = s.next();
        } while (resposta.equalsIgnoreCase("sim"));
        System.out.println("Obrigado");
    }

    public static void main(String[] args) {

        List<Integer> valores = new ArrayList<>();
        for(Integer i : valores){
            System.out.println("Linha: " + i);
        }

        valores.forEach(i -> System.out.println("Linha: " + i));

        forEx1();
        System.out.println("----------------------------------------");

        tabuada();
        System.out.println("----------------------------------------");

        breakEx();
        System.out.println("----------------------------------------");

        whileEx();
        System.out.println("----------------------------------------");

        tabuadaInterativa();
        System.out.println("----------------------------------------");

        doWhile();

    }

}
