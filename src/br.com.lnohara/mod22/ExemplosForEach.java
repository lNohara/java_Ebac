package br.com.lnohara.mod22;

import java.util.List;

public class ExemplosForEach {

    public static void main(String[] args) {

        List<Pessoa> lista = new Pessoa().popularPessoas();

        System.out.println(" *** Imprimindo o nome de todas as pessoas ***");
        lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println(" *** Filtrando os brasileiros ***");
        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
                .forEach(p -> System.out.println(p.getNome()));

        System.out.println(" *** Criando um map da idade dos brasileiro ***");
        System.out.println("Não tem mais a pessoa completa, apenas a idade");
        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
                .map(Pessoa::getIdade)
                .forEach(p -> System.out.println(p));

    }
}
