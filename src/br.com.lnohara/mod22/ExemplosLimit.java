package br.com.lnohara.mod22;

import java.util.List;
import java.util.stream.Stream;

public class ExemplosLimit {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        Stream<Pessoa> stream = lista.stream().limit(2);
    }
}
