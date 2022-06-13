package br.com.lnohara.mod11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Aula2 {

    public static void main(String[] args) {
        exemploSimpleOrdenadaClasseExterna();
        exempliListaSimplesOerdenadaComparatorAluno();

        exemploListaSimples();
        exemploListaSimplesOerdemAscendente();
    }

    private static void exemploSimpleOrdenadaClasseExterna(){
        System.out.println("***** exemploSimpleOrdenadaClasseExterna *****");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        lista.add(a);
        lista.add(b);
        lista.add(c);

        System.out.println(lista);

        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    private static void exempliListaSimplesOerdenadaComparatorAluno(){
        System.out.println("***** exempliListaSimplesOerdenadaComparatorAluno *****");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 20);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 30);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 10);
        lista.add(a);
        lista.add(b);
        lista.add(c);

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista com ordenação por nota" + lista);

        System.out.println("");
    }

    private static void exemploListaSimples(){
        System.out.println("***** exemploListaSimples *****");
        List<String> lista = new LinkedList<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);

        System.out.println("");

        System.out.println("Removendo o idex zero, João da Silva");
        lista.remove(0);
        System.out.println(lista);
        boolean contem = lista.contains("João da Silva");
        System.out.println("Verificando se minha lista tem o item João da Silva");
        System.out.println(contem);

        System.out.println("");

        System.out.println("Verificando se minha lista tem o item Antonio Sousa");
        contem = lista.contains("Antonio Sousa");
        System.out.println(contem);

        System.out.println("");

        System.out.println("Imprimindo com o for");
        for (String nome : lista){
            System.out.println(nome);
        }

        System.out.println("");

        System.out.println("Imprimindo um índice específico");
        System.out.println(lista.get(0));
    }

    private static void exemploListaSimplesOerdemAscendente(){
        System.out.println("***** exemploListaSimplesOerdemAscendente *****");
        List<String> lista = new LinkedList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

}
