package br.com.lnohara.mod15.aula02;

public class SingtonPropriedade {
    private static SingtonPropriedade singtonPropriedade;
    private String value;

    private SingtonPropriedade(String value){
        this.value = value;
    }

    public static SingtonPropriedade getIntance(String value){
        if(singtonPropriedade == null){
            singtonPropriedade = new SingtonPropriedade(value);
        }
        return singtonPropriedade;
    }

    public String getValue() {
        return value;
    }
}
