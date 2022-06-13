package br.com.lnohara.mod16.aula01;

public abstract class Trabalhador {

    public void executarRotina(){
        iniciarRotina();
        levantar();
        irParaTrabalho();
        trabalhar();
        voltarParaCasa();
        System.out.println("-----------------------------");
    }

    protected void voltarParaCasa() {
        System.out.println("Voltando para casa");
    }

    protected abstract void trabalhar();

    protected void irParaTrabalho() {
        System.out.println("Indo trabalhar");
    }

    protected void iniciarRotina(){
        System.out.println("Iniciando Rotina");
    }

    protected void levantar(){
        System.out.println("Levantando da Cama");
    }
}
