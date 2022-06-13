package br.com.lnohara.mod22;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ExemplosCollect {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        List<Pessoa> brasileiros = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
                .collect(Collectors.toList());

       brasileiros.forEach(System.out::println);

        separator();

        System.out.println("Imprimido direto com o forEach");
        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        separator();

        Set<Pessoa> set = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
                .collect(Collectors.toSet());
        set.forEach(System.out::println);

        separator();

        ArrayList<Pessoa> arrayList = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
                .collect(Collectors.toCollection(ArrayList::new));
        arrayList.forEach(System.out::println);

        separator();

        Map<Integer, Pessoa> map = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
                .collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new));
        map.forEach((k,v) -> System.out.println(k + " / " + v));

        separator();

        System.out.println("Filtrando por idade");
        Map<Integer, List<Pessoa>> grupoPorIdade = lista.stream()
                .collect(Collectors.groupingBy(Pessoa::getIdade));
        grupoPorIdade.forEach((k,v) -> System.out.println(k + " / " + v));

        separator();

        System.out.println("Filtrando por Nacionalidade");
        Map<String, List<Pessoa>> grupoPorNacionalidade = lista.stream()
                .collect(Collectors.groupingBy(Pessoa::getNacionalidade));
        grupoPorNacionalidade.forEach((k,v) -> System.out.println(k + " / " + v));

        separator();

        System.out.println("Filtrando por Nacionalidade");
        Map<String, Integer> grupoPorNacionalidadeSomadosIdades = lista.stream()
                .collect(Collectors.groupingBy(Pessoa::getNacionalidade,
                        Collectors.summingInt(Pessoa::getIdade)));
        grupoPorNacionalidadeSomadosIdades.forEach((k,v) -> System.out.println(k + " / " + v));
    }

    public static void separator(){
        System.out.println("**********************");
        System.out.println("**********************");
    }
}
