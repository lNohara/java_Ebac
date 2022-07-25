package br.com.lnohara.mod25.domain;

import br.com.lnohara.mod25.dao.ClienteDAOMock;
import br.com.lnohara.mod25.dao.IClienteDAO;
import br.com.lnohara.mod25.exception.TipoChaveNaoEncontradaException;
import br.com.lnohara.mod25.services.ClienteService;
import br.com.lnohara.mod25.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest(){
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(123123123L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(13);
        cliente.setTel(1112312312L);
        clienteService.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteService.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException{

        cliente.setNome("Rodrigo Pires");
        clienteService.alterar(cliente);

        Assert.assertEquals("Rodrigo Pires", cliente.getNome());
    }
}