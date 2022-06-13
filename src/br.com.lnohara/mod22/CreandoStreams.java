package br.com.lnohara.mod22;

import java.util.stream.Stream;

public class CreandoStreams {
    public static void main(String[] args) {

/*        Stream<String> stream = List.of("Rodrigo", "Pires", "Testes").stream();
        Stream<String> set = Set.of("Rodrigo","Pires", "Teste").stream();

        Map<String, String> map = Map.of("rodrigo", "Pires");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valor = map.values().stream();*/

        Stream<String> stringStream = Stream.of("String", "asdg");
    }
}
