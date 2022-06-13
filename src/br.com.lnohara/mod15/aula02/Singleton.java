package br.com.lnohara.mod15.aula02;

/**
 * Usado quando desejado, que uma classe tenha apenas uma instância na aplicação.
 *
 * O construtor da classe fica como privado (private), sendo que não pode ser instanciado fora da própria classe
 *
 *  A classe é final, pois não permite a criação de subclasses da própria classe.
 *
 *  O acesso é permitido através do método que retorna a instância única da classe, ou faz a criação de uma, casão não tenha sido criada.
 */

public class Singleton {

    private static Singleton singleton;

    private Singleton(){

    }

    public static Singleton getIntance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
