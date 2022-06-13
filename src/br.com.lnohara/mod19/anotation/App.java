package br.com.lnohara.mod19.anotation;

public class App {
    public static void main(String[] args) {

        Tabela tabela = new Tabela();
        tabela.checaAnnotation(tabela);

        System.out.println("-----------------------------------");
        tabela.setNome("Exercício Módulo 19");
        tabela.checaAnnotation(tabela);
    }
}

