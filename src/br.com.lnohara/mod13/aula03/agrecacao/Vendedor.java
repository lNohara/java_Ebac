package br.com.lnohara.mod13.aula03.agrecacao;

public class Vendedor {
    private String nome;
    private double comissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void vende(){
        System.out.println("Vender");
    }
}
