package br.com.lnohara.mod13.aula02;

public abstract class Empregado {

    private String nome;
    private String sobrenome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Metodo abstrado
     * que todo mundo precisa implementar
     */
    public abstract Double vencimento();

    /**
     * Método que todas as classes filhas já tem acesso
     * e Podem usar sem fazer mais nada
     */
    public void imprimirSobrenome(){
        System.out.println("Sobrenome é: " + this.sobrenome);
        System.out.println("----------------------------");
    }

    /**
     * Misto dos dois anteriores
     * Todas as filhas tem acesso
     * Mas a saida muda de acordo com a implementação
     * do metodo vencimento()
     */
    public void imprimirValores(){
        Double valor = vencimento();
        System.out.println(valor);
    }
}
