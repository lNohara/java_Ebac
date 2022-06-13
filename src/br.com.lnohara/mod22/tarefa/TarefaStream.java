package br.com.lnohara.mod22.tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TarefaStream {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Quantas pessoas deseja cadastrar?: ");
        int qtd = scan.nextInt();
        Pessoa[] pessoa = new Pessoa[qtd];

        System.out.println("Informe o primeiro nome, quando o nome for solicitado");
        System.out.println("Informe m ou f, quando sexo for solicitado");
        Scanner keyboard = new Scanner(System.in);
        String entry;
        List<Pessoa> p = new ArrayList<Pessoa>();

        for(int x=0; x<pessoa.length; ++x){
            pessoa[x] = new Pessoa();
        }

        for(int x=0; x<pessoa.length; x++){
            System.out.print("Nome #" + (x+1) + ": ");
            pessoa[x].setNome(keyboard.nextLine());

            System.out.print("m/f #" + (x+1) + ": ");
            pessoa[x].setSexo(keyboard.nextLine());

            p.add(pessoa[x]);
        }

        exibeCadastrados(p);
        System.out.println("****************************");

        exibeMulheresCollect(p);
        System.out.println("****************************");

        exibeMulheresForEach(p);
        System.out.println("****************************");

        contantoAsMulheres(p);
        System.out.println("****************************");
    }

    public static void exibeCadastrados(List<Pessoa> p){
        System.out.println("Exibindo todas as pessoas cadastradas");
        System.out.println("Pessoas Cadastradas" + p);
    }

    public static void exibeMulheresCollect(List<Pessoa> p){
        System.out.println("Utilizando filter, collect e forEach");
        p.stream()
                .filter(mulheres -> mulheres.getSexo()
                        .equalsIgnoreCase("f"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void exibeMulheresForEach(List<Pessoa> p){
        System.out.println("Utilizando filter e forEach");
        p.stream()
                .filter((pessoa -> pessoa.getSexo().equalsIgnoreCase("f")))
                .forEach(pessoa -> System.out.println(pessoa));
    }

    public static void contantoAsMulheres(List<Pessoa> p){
        long count = p.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("f"))
                .count();
        System.out.println("Total de Mulheres: " + count);
    }
}
