package br.com.lnohara.mod17.tarefa.Chevrolet;

public class Camaro extends Chevrolet{
    @Override
    public String getModelo() {
        return "Camaro";
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }
}
