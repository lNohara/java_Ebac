package br.com.lnohara.mod22;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemplosSorted {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Pessoa> stream = lista.stream().filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getNome));
    }

}
