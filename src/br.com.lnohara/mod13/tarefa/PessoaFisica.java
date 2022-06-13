package br.com.lnohara.mod13.tarefa;

public class PessoaFisica extends Pessoa{
    public String cpf;
    public String estadoCivil;

    /**
     * Construtor padrão
     */
    public PessoaFisica(){}

    /**
     * Construtor utilizado no metodo criarPessoaFisca
     * @param nome
     * @param idade
     * @param endereco
     * @param cpf
     * @param estadoCivil
     */
    public PessoaFisica(String nome, int idade, String endereco, String cpf, String estadoCivil) {
        super.setNome(nome);
        super.setIdade(idade);
        super.setEndereco(endereco);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public void pagarImposto() {
        System.out.println("Pagando os impostos referentes à Pessoa Física");
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome = '" + super.getNome() + '\'' +
                ", endereco = '" + super.getEndereco() + '\'' +
                ", idade = " + super.getIdade() + '\'' +
                ", cpf = " + cpf + '\'' +
                ", estado civil = " + estadoCivil +
                '}';
    }
}
