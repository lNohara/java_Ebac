package br.com.lnohara.mod29.dao.generic.jdbc.produto;

import br.com.lnohara.mod29.domain.Produto;

import java.sql.SQLException;
import java.util.List;

public interface IProdutoDAO {

    public Integer cadastrar (Produto produto) throws Exception;

    Produto consultarProduto(int codigoDeBarras) throws Exception;

    Produto alterarProduto(Produto produto) throws Exception;;

    List<Produto> pesquisarTodosProdutos() throws SQLException;

    Integer excluir(Produto produtoConsultado) throws SQLException;;
}
