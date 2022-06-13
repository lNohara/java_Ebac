package br.com.lnohara.mod17.tarefa.Jeep;

import br.com.lnohara.mod17.tarefa.Carro;

public abstract class Jeep implements Carro {

    @Override
    public String getMarca() {
        return "Jeep";
    }
}
