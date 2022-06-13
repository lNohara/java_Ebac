package br.com.lnohara.mod22.tarefa;

public class Pessoa {

    private String nome;
    private String sexo;

    // Construtor padrão
    public Pessoa(){}

    public Pessoa (String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    public Pessoa (Pessoa pessoa){
        this(pessoa.getNome(), pessoa.getSexo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
