package br.com.lnohara.mod29.dao.generic.jdbc.dao.cliente;


import br.com.lnohara.mod29.domain.Cliente;

import java.util.List;

public interface IClienteDAO {

    public Integer cadastrar(Cliente cliente) throws Exception;

    public Cliente consultar (String codigo) throws Exception;

    Integer excluir(Cliente clienteBD) throws Exception;

    List<Cliente> pesquisarTodosClientes() throws Exception;

    Cliente atualizar(Cliente cliente) throws Exception;
}
