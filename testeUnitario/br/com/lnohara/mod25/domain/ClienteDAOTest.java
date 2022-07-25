package br.com.lnohara.mod25.domain;

import br.com.lnohara.mod25.dao.ClienteDAOMock;
import br.com.lnohara.mod25.dao.IClienteDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

    public ClienteDAOTest(){
        clienteDao = new ClienteDAOMock();
    }

    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setCpf(123123123L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(13);
        cliente.setTel(1112312312L);
        clienteDao.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente(){
        Boolean retorno = clienteDao.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente(){
        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente(){
        cliente.setNome("Rodrigo Pires");
        clienteDao.alterar(cliente);

        Assert.assertEquals("Rodrigo Pires", cliente.getNome());
    }
}
