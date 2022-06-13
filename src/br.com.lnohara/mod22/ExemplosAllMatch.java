package br.com.lnohara.mod22;

import java.util.List;

public class ExemplosAllMatch {

    public static void main(String[] args) {

        List<Pessoa> lista = new Pessoa().popularPessoas();

        boolean result = lista.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"));
        System.out.println(result);

        // como fazer no método convencional:
        Boolean re = true;
        for(Pessoa p : lista) {
            if(!p.getNome().equalsIgnoreCase("Brasil")){
                re = false;
                break;
            }
        }
        System.out.println(re);
    }
}
