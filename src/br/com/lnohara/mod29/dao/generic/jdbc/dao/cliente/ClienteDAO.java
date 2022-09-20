package br.com.lnohara.mod29.dao.generic.jdbc.dao.cliente;

import br.com.lnohara.mod29.dao.generic.jdbc.ConnectionFactory;
import br.com.lnohara.mod29.domain.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO {

    @Override
    public Integer cadastrar(Cliente cliente) throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = "INSERT INTO TB_CLIENTE_2 (ID, CODIGO, NOME) VALUES (nextval('SQ_CLIENTE_2'),?,?)";
            stm = connection.prepareStatement(sql);
            stm.setString(1, cliente.getCodigo());
            stm.setString(2, cliente.getNome());
            return  stm.executeUpdate();
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

    @Override
    public Cliente consultar(String codigo) throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Cliente cliente = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM tb_cliente_2 where codigo = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, codigo);
            rs = stm.executeQuery();
            if(rs.next()){
                cliente = new Cliente();
                cliente.setId(rs.getLong("id"));
                cliente.setCodigo(rs.getString("codigo"));
                cliente.setNome(rs.getString("nome"));
            }
            return cliente;
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

    @Override
    public Integer excluir(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = "DELETE FROM TB_CLIENTE_2 WHERE CODIGO = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, cliente.getCodigo());
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

    @Override
    public List<Cliente> pesquisarTodosClientes() throws Exception {
        List<Cliente> todosClientes = new ArrayList<>();
        Cliente cliente = null;
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM TB_CLIENTE_2";
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while(rs.next()){
                cliente = new Cliente();
                Long id = rs.getLong("ID");
                String nome = rs.getString("NOME");
                String codigo = rs.getString("CODIGO");
                cliente.setId(id);
                cliente.setNome(nome);
                cliente.setCodigo(codigo);
                todosClientes.add(cliente);
            }
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
        return todosClientes;
    }

    @Override
    public Cliente atualizar(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = "UPDATE tb_cliente_2 SET ID = ?, NOME = ? WHERE CODIGO = ?";
            stm = connection.prepareStatement(sql);
            stm.setLong(1, cliente.getId());
            stm.setString(2, cliente.getNome());
            stm.setString(3, cliente.getCodigo());
            stm.executeUpdate();
            return cliente;
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
