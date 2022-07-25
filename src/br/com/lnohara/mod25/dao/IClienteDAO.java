package br.com.lnohara.mod25.dao;

import br.com.lnohara.mod25.dao.generics.IGenericDAO;
import br.com.lnohara.mod25.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

    //Código que estava funcionando antes de importar as classes Genetics do mod 19
/*    Boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente);

    Class<Cliente> getTipoClasse();*/
}
