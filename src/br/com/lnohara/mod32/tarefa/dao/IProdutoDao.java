package br.com.lnohara.mod32.tarefa.dao;

import br.com.lnohara.mod32.tarefa.domain.Produto;

import java.util.List;

public interface IProdutoDao {
    public Produto cadastrar(Produto produto);

    public Produto getByCodigoDeBarras(Long codigo);

    Produto consultarPorCodigoDeBarras(Long codigoDeBarras);

    List<Produto> listarTodos();

    public List<Produto> consultarTodos();


    Produto merge(Long codigoDeBarras, String nome, String descricao,
                  String dataFabricacao, String dataVencimento, Double valor);

    void deletarPorCodigoDeBarras(Long codigoDeBarras);

    void excluir(Produto produto);
}