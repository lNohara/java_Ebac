package br.com.lnohara.mod16.aula01;

public class Advogado extends Trabalhador {
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como Advogado");
    }

    @Override
    protected void voltarParaCasa() {
        System.out.println("Voltar para casa de carro");
    }

    @Override
    protected void irParaTrabalho() {
        System.out.println("Indo para o trabalho de carro");
    }

    @Override
    protected void iniciarRotina() {
        super.iniciarRotina();
    }

    @Override
    protected void levantar() {
        System.out.println("Levantando às 9h");
    }
}
