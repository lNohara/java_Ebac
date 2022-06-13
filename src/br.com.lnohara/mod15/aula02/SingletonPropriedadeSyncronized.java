package br.com.lnohara.mod15.aula02;

public class SingletonPropriedadeSyncronized {
    private static SingletonPropriedadeSyncronized  singletonPropriedadeSyncronized;
    private String value;

    private SingletonPropriedadeSyncronized(String value){
        this.value = value;
    }

    // tomar cuidado com o synchronized pois ele pode travar a aplicação toda
    public static synchronized SingletonPropriedadeSyncronized getInstance(String value){
        if(singletonPropriedadeSyncronized == null){
            singletonPropriedadeSyncronized = new SingletonPropriedadeSyncronized(value);
        }
        return singletonPropriedadeSyncronized;
    }

    public String getValue() {
        return value;
    }
}
