package br.com.lnohara.mod13.tarefa;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private int idade;

    /**
     * Construtor padrão
     */
    public Pessoa(){}

    /**
     * Construtor com os atributos que serao comuns
     * à todas as classes filhas
     * @param nome
     * @param endereco
     * @param idade
     */
    public Pessoa(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Metodo que todas as subclasses(filhas)
     * poderao utilizar sem precisar sobrescrever nada
     * @param idade
     * @return
     */
    public int fazerAniversario(int idade){
        return this.idade = idade + 1;
    }

    /**
     * Método que todas a subclasses (filhas)
     * deverão implementar
     */
    public abstract void pagarImposto();

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", idade=" + idade +
                '}';
    }
}
