package br.com.lnohara.mod10;

import java.util.Scanner;

public class Aula1 {

    public static void devider(){
        System.out.println("********************************");
    }

    public static void controleFluxo(){
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número: ");

        int result = s.nextInt();

        if (result == 5) {
            System.out.println("O resultado é 5");
        } else if (result > 5){
            System.out.println("Resutado maior que 5");
        } else {
            System.out.println("Resultado menor que 5");
        }
    }

    public static String getIdade(int idade){
        if (idade >= 0 && idade <= 5){
            return "Você eh um bebe";
        } else if (idade >=6 && idade <= 10){
            return "Você é uma criança";
        } else if (idade >= 11 && idade <=18){
            return "Você é um teen";
        } else        {
            return "Você eh adulto";
        }
    }

    public static void showIdade(){
        Scanner s = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    public static String exampleOfIf(String animal){
        String result;
        if(animal.equals("DOG") || animal.equals("CAT")){
            result = "domestic animal";
        } else if (animal.equals("TIGER")){
            result = "wild animal";
        } else {
            result = "unknown animal";
        }
        return result;
    }

    public static void showAnimal(){
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o nome de um animal: ");
        String texto = s.next();
        String animal = exampleOfIf(texto);
        System.out.println(animal);
    }

    public static void main(String[] args) {
        devider();

        System.out.println("Controle de fluxo");
        controleFluxo();

        devider();

        System.out.println("Idade");
        showIdade();

        devider();

        System.out.println("Animal");
        showAnimal();
    }
}
