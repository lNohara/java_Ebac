package br.com.lnohara.mod10;

import java.util.Scanner;

public class Aula3 {

    public static void switchEx(){
        Scanner s = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }


    public static String getIdade(int idade){
        String result;
        switch (idade) {
            case 0:
            case 5:
                result = "Você é um bebê";
                break;
            case 6:
            case 10:
                result = "Você é uma criança";
                break;
            case 11:
            case 18:
                result = "Você é um teen";
                break;
            default:
                result = "Você é adulto";
                break;
        }
        return result;
    }

    public static void switchAnimal(){
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o nome de um animal: ");
        String texto = s.next();
        String animal = caseAnimal(texto);
        System.out.println(animal);
    }

    public static String caseAnimal(String animal){
        String result;
        switch (animal){
            case "DOG":
            case "CAT":
                result = "domestic animal";
                break;
            case "TIGER":
                result = "wild animal";
                break;
            default:
                result = "unknow animal";
                break;
        }
        return result;
    }

    public static void main(String[] args) {

        switchEx();
        switchAnimal();
    }
}
