package br.com.lnohara.mod25.services;

import br.com.lnohara.mod25.dao.IClienteDAO;
import br.com.lnohara.mod25.dao.generics.GenericDAO;
import br.com.lnohara.mod25.dao.generics.IGenericDAO;
import br.com.lnohara.mod25.domain.Cliente;
import br.com.lnohara.mod25.exception.TipoChaveNaoEncontradaException;
import br.com.lnohara.mod25.services.generic.GenericService;

import java.util.Collection;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
    public ClienteService(IClienteDAO dao) {
        super(dao);
    }

    // código que estava sendo usado antes de implemetar generic na casamada de serviço
/*    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO){
        this.clienteDAO = clienteDAO;
    }*/


    @Override
    public Boolean cadastrar(Cliente entity) {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(Long valor) {
        super.excluir(valor);
        this.dao.excluir(valor);
    }

    @Override
    public void alterar(Cliente entity) {
        this.dao.alterar(entity);
    }

    @Override
    public Cliente consultar(Long valor) {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.dao.buscarTodos();
    }
}
