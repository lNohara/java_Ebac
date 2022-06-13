package br.com.lnohara.mod17.tarefa.Jeep;

public class Commander extends Jeep{
    @Override
    public String getModelo() {
        return "Commander";
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }
}
