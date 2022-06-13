package br.com.lnohara.mod13.aula01;

public interface ICarro {

    public void andar();

    default void parar(){
        System.out.println("O veículo está em parando");
    }
}
