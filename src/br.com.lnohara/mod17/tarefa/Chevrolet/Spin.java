package br.com.lnohara.mod17.tarefa.Chevrolet;

public class Spin extends Chevrolet{
    @Override
    public String getModelo() {
        return "Spin";
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }
}
