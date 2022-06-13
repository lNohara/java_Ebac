package br.com.lnohara.mod19.aula01e02;

import br.com.lnohara.mod19.aula01e02.anotacao.ChavePrincipal;

@Deprecated
@ChavePrincipal("Nome de Classe")
public class ProdutoReflection implements IProdutoInterface{

    @ChavePrincipal("getCodigo")
    private Long codigo;
    private String nome;
    private Double valor;
    public ProdutoReflection(){

    }

    public ProdutoReflection (Long codigo){
        this.codigo = codigo;
    }


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
