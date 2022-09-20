package br.com.lnohara.mod29.dao.generic.jdbc.produto;

import br.com.lnohara.mod29.dao.generic.jdbc.ConnectionFactory;
import br.com.lnohara.mod29.domain.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class ProdutoDAO implements IProdutoDAO{

    @Override
    public Integer cadastrar(Produto produto) throws Exception {
        Connection connection = null ;
        PreparedStatement stm = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = "INSERT INTO TB_PRODUTO2 (ID, NOME, CODIGO_DE_BARRAS, PRECO) VALUES (nextval('SQ_PRODUTO_2'), ?, ?, ?)";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getNome());
            stm.setInt(2, produto.getCodigoDeBarras());
            stm.setFloat(3, produto.getPreco());
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if(stm != null && stm.isClosed()){
                stm.close();
            }
            if(connection != null && !connection.isClosed()){
                connection.close();
            }
        }
    }

    @Override
    public Produto consultarProduto(int codigoDeBarras) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try{
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM tb_produto2 where codigo_de_barras = ?";
            stm = connection.prepareStatement(sql);
            stm.setInt(1, codigoDeBarras);
            rs = stm.executeQuery();
            Produto produto = new Produto();
            if(rs.next()){
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setCodigoDeBarras(rs.getInt("codigo_de_barras"));
                produto.setPreco((rs.getLong("preco")));
            }
            return produto;
        } catch (Exception e){
            throw e;
        }finally {
            if(stm != null && stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()){
                connection.isClosed();
            }
        }
    }

    @Override
    public Produto alterarProduto(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "UPDATE tb_produto2 SET NOME = ?, PRECO = ? WHERE CODIGO_DE_BARRAS = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getNome());
            stm.setFloat(2, produto.getPreco());
            stm.setInt(3, produto.getCodigoDeBarras());
            stm.executeUpdate();
            return produto;
        } catch (Exception e){
            throw e;
        } finally {
            if(stm != null && stm.isClosed()){
                stm.close();
            }
            if(connection != null && !connection.isClosed()){
                connection.isClosed();
            }
        }
    }

    @Override
    public List<Produto> pesquisarTodosProdutos() throws SQLException {
        List<Produto> todosProdutos = new ArrayList<>();
        Produto produto = null;
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM TB_PRODUTO2";
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while(rs.next()){
                produto = new Produto();
                Integer id = rs.getInt("id");
                String nome = rs.getString("nome");
                Integer codigoDeBarras = rs.getInt("codigo_de_barras");
                Float preco = rs.getFloat("preco");
                produto.setId(id);
                produto.setNome(nome);
                produto.setCodigoDeBarras(codigoDeBarras);
                produto.setPreco(preco);
                todosProdutos.add(produto);
            }
        } catch (Exception e){
            throw e;
        }
        finally {
            if(stm != null && stm.isClosed()) {
                stm.close();
            }
            if(connection != null && !connection.isClosed()){
                connection.close();
            }
        }
        return todosProdutos;
    }

    @Override
    public Integer excluir(Produto produtoConsultado) throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "DELETE FROM TB_PRODUTO2 WHERE CODIGO_DE_BARRAS = ?";
            stm = connection.prepareStatement(sql);
            stm.setInt(1, produtoConsultado.getCodigoDeBarras());
            return stm.executeUpdate();
        } catch (Exception e){
            throw e;
        } finally {
            if(stm != null && stm.isClosed()) {
                stm.close();
            }
            if(connection != null && !connection.isClosed()){
                connection.close();
            }
        }
    }


}
