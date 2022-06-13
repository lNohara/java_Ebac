package br.com.lnohara.mod13.aula01;

public class Caminhao implements ICarro{
    @Override
    public void andar() {
        System.out.println("O caminhao está andando devagar");
    }

    /**
     * Esse método é defaut na interface
     * Eu não preciso implementá-lo a menos que seja
     * necessário sobrescrevê-lo
     */
    @Override
    public void parar() {
        System.out.println("O Caminhão está parando");
    }
}
