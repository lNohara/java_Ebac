package br.com.lnohara.mod25.services;

import br.com.lnohara.mod25.domain.Cliente;
import br.com.lnohara.mod25.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    //Código que estava sendo utilizado antes de criar generic para camada de serviço também
/*    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    public Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;*/
}
