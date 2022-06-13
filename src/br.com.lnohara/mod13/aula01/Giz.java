package br.com.lnohara.mod13.aula01;

public class Giz implements ICaneta {

    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor: " + texto + " Na Classe: " + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Branco";
    }
}
