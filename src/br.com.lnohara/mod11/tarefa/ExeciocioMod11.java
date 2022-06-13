package br.com.lnohara.mod11.tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExeciocioMod11 {
    public static void main(String[] args) {
        adicionaPessoaNaLista();
    }

    public static void adicionaPessoaNaLista(){
        List<Pessoa> m = new ArrayList<>();
        List<Pessoa> f = new ArrayList<>();

        String masculino = "M";
        String feminimo = "F";
        String resposta = "";

        Scanner scan = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        do {
        System.out.print("Informe seu primeiro nome: ");
        Scanner sNome = new Scanner(System.in);
        String nome = sNome.nextLine();

        System.out.println("M para homes - F para Mulheres");
        System.out.print("Informe seu gênero: ");
        Scanner sexo = new Scanner(System.in);
        String genero = sexo.nextLine();

        Pessoa pessoa = new Pessoa(nome, genero);

        if (genero.equalsIgnoreCase(masculino) || genero.equalsIgnoreCase(feminimo)){
            if (pessoa.getSexo().equalsIgnoreCase("M")){
                m.add(pessoa);
            } else {
                f.add(pessoa);
            }
        } else {
            System.out.println("Valor inválido para o gênero");
        }

        System.out.println("**********************************************");
        System.out.println("Lista de Homens: " + m);
        System.out.println("Lista de Mulheres: " + f);

        System.out.println("**********************************************");
        System.out.println("Deseja adicionar uma nova pessoa?");
        System.out.print("Digite SIM para continuar: ");
        resposta = s.next();

        } while (resposta.equalsIgnoreCase("sim"));
    }
}
