package br.com.lnohara.mod08;

public class Aula01 {

    private int codigo;
    private long codioMaior;
    private float valorDecimal;
    private double valorDecimal1;
    private String texto;
    private boolean status;
    private short shor;
    private byte bi;

    public Aula01(){}

    public Aula01 (int inteiro){
        this.codigo = inteiro;
    }


    /**
     *
     * @return a String
     */
    public String retornaTexto(){
        return "Uma String";
    }

    /**
     *
     * @return an int number
     */
    public int retornaInteiro(){
        return 10;
    }

    /**
     *
     * @return the local variable value
     */
    public int retornaInt(){
        int inteiro = 10;
        return inteiro;
    }

    /**
     *
     * @param num num to return
     * @return a long number
     */
    public long retornaLong(long num){
        return num;
    }
}
