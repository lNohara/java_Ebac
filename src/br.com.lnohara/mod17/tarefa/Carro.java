package br.com.lnohara.mod17.tarefa;

public interface  Carro {
    public abstract String getMarca();

    public default String getModelo(){
        return "Modelo";
    }
}
