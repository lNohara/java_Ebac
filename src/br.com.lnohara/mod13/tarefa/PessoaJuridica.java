package br.com.lnohara.mod13.tarefa;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String ramoDeAtividade;

    /**
     * Costrutor padrão
     */
    public PessoaJuridica() {
    }

    /**
     * Construtor utilizado no metodo criarPessoaJuridica
     * @param nome
     * @param idade
     * @param endereco
     * @param cnpj
     * @param ramoDeAtividade
     */
    public PessoaJuridica(String nome, int idade, String endereco, String cnpj, String ramoDeAtividade) {
        super.setNome(nome);
        super.setIdade(idade);
        super.setEndereco(endereco);
        this.cnpj = cnpj;
        this.ramoDeAtividade = ramoDeAtividade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRamoDeAtividade() {
        return ramoDeAtividade;
    }

    public void setRamoDeAtividade(String ramoDeAtividade) {
        this.ramoDeAtividade = ramoDeAtividade;
    }

    @Override
    public void pagarImposto() {
        System.out.println("Pagando os impostos referentes à Pessoa Jurídica");
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nome =' " + super.getNome() + '\'' +
                ", endereco =' " + super.getEndereco() + '\'' +
                ", idade = " + super.getIdade() + '\'' +
                ", cnpj = " + cnpj + '\'' +
                ", ramo de atividade = " + ramoDeAtividade +
                '}';
    }
}
