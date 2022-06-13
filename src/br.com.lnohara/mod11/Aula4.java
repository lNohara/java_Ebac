package br.com.lnohara.mod11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aula4 {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNovo();
        exemploListaAlunos();
        exemploConsultando();
        exemploremover();
        exemploTreeSet();
    }

    /**
     * HashSet não tem ordem
     * O acesso aos dados é mais rápido que em um TreeSet, mas nada garante que os dados estejam ordenados
     * Não repete valores na lista
     */

    public static void exemploListaSimples(){
        System.out.println("***** exemploListaSimples *****");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploNovo(){
        System.out.println("***** exemploNovo *****");
        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(2);
        inteiros.add(1);
        inteiros.add(1);
        System.out.println(inteiros);
    }

    private static void exemploListaAlunos(){
        System.out.println("**** exemploListaAlunos *****");

        Set<Aluno> lista = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        System.out.println(lista);

    }

    private static void exemploListaSimplesOrdemAscendente(){
        System.out.println("**** exemploListaSimplesOrdemAscendente *****");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");

        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploConsultando(){
        System.out.println("**** exemploConsultando *****");

        Set<Aluno> lista = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        System.out.println(lista);

        System.out.println(lista.contains(a));

        Aluno e = new Aluno("Barabara Anna", "OpenOffice", 0);
        System.out.println(lista.contains(e));
    }

    private static void exemploremover(){
        System.out.println("**** exemploremover *****");

        Set<Aluno> lista = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        System.out.println(lista);

        lista.remove(a);
        System.out.println(lista);

        for(Aluno aluno : lista){
            System.out.println(aluno);
        }
    }


    /**
     * Os dados são classificados, mas o aceso é mas lento que em um HasSet
     * Não repete valor na lista
     * Tem ordem natural dos objetos
     */

    private static void exemploTreeSet(){
        System.out.println("***** exemploTreeSet *****");
        Set<String> lista = new TreeSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println("");
    }
}
