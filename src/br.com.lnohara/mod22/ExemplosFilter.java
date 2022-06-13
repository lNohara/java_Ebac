package br.com.lnohara.mod22;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemplosFilter {

    public static void main(String[] args) {

        //1
        List<Pessoa> lista = new Pessoa().popularPessoas();
        Stream<Pessoa> stream = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"));

        //2
        Predicate<Pessoa> pred = pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil");
        Stream<Pessoa> stream1 = lista.stream().filter(pred);

        //3
        Predicate<Pessoa> pred1 = new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equalsIgnoreCase("Brasil");
            }
        };
        Stream<Pessoa> stream2 = lista.stream().filter(pred1);

        // os 3 fazem exatamente a mesma coisa
    }
}
