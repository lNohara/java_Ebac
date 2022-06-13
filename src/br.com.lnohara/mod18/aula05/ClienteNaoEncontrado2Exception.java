package br.com.lnohara.mod18.aula05;

public class ClienteNaoEncontrado2Exception extends Exception {

    private Exception ex;
    public ClienteNaoEncontrado2Exception(String msg, Throwable e){
        super(msg, e);
    }
}
