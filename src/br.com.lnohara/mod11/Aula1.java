package br.com.lnohara.mod11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula1 {

    /**
     *  ArrayList é como um array cujotamanho pode crescer
     *  A busca de um elemento é rápida, mas inserções e exclusões não são
     */

    private static void exemploListaSimples(){
        System.out.println("***** exemploListaSimples *****");
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOdemAscendente(){
        System.out.println("**** exemploListaSimplesOdemAscendente ****");
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOdemAscendente();
    }

}
