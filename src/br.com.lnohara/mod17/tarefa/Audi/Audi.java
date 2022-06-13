package br.com.lnohara.mod17.tarefa.Audi;

import br.com.lnohara.mod17.tarefa.Carro;

public abstract class Audi implements Carro {
    @Override
    public String getMarca() {
        return "Audi";
    }
}
