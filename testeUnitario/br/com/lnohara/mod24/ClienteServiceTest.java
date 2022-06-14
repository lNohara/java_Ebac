package br.com.lnohara.mod24;

import br.com.lnohara.mod24.dao.ClienteDao;
import br.com.lnohara.mod24.dao.mocks.ClienteDaoMock;
import br.com.lnohara.mod24.dao.inteterfaces.IClienteDao;
import br.com.lnohara.mod24.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest(){
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService clienteService = new ClienteService(mockDao);
        String retorno = clienteService.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest(){
        IClienteDao clienteDao = new ClienteDao();
        ClienteService clienteService = new ClienteService(clienteDao);
        String retorno = clienteService.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
