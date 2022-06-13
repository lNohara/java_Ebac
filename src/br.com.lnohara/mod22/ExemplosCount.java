package br.com.lnohara.mod22;

import java.util.List;

public class ExemplosCount {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        long count =  lista.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("M"))
                .count();

        System.out.println(count);
    }
}
