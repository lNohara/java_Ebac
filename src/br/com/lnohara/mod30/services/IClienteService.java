package br.com.lnohara.mod30.services;

import br.com.lnohara.mod30.domain.Cliente;
import br.com.lnohara.mod30.exceptions.DAOException;
import br.com.lnohara.mod30.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}