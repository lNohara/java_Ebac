package br.com.lnohara.mod22;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExemplosOptional {
    public static void main(String[] args) {

        List<Pessoa> lista = new Pessoa().popularPessoas();

        Optional<Pessoa> max = lista.stream()
                .max(Comparator.comparing(Pessoa::getIdade));

        System.out.println("Fazendo a verificação");
        if(max.isPresent()){
            System.out.println(max.get());
        }

        System.out.println("Fazendo a verificação só que com menos código");
        max.ifPresent(System.out::println);

        System.out.println("min");
        Optional<Pessoa> min = lista.stream()
                .min(Comparator.comparing(Pessoa::getIdade));
        min.ifPresent(System.out::println);

    }
}
