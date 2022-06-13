package br.com.lnohara.mod22;

import java.util.List;

public class ExemplosMap {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoas();

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
                .map(Pessoa::getIdade);
    }
}
