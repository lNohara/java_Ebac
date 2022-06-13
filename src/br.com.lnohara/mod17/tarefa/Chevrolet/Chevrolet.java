package br.com.lnohara.mod17.tarefa.Chevrolet;

import br.com.lnohara.mod17.tarefa.Carro;

public abstract class Chevrolet implements Carro {
    @Override
    public String getMarca() {
        return "Chevrolet";
    }
}
