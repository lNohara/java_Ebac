package br.com.lnohara.mod13.aula01;

public interface ICaneta {
    public void escrever(String texto);

    public String getCor();

    /**
     * Recurso defaut foi disponibilizado no java 8
     * Todas as outras classes vão poder usar
     * Note que as classes que extendem essa interface não
     * são obrigadas a implementar esse método
     */
    default void escreverComumATodas(){
        System.out.println("Escrita igual a todas");
    }
}
