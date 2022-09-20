package mod29.domain;

import br.com.lnohara.mod29.dao.generic.jdbc.dao.cliente.ClienteDAO;
import br.com.lnohara.mod29.dao.generic.jdbc.dao.cliente.IClienteDAO;
import br.com.lnohara.mod29.domain.Cliente;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void testCliente() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("1");
        cliente.setNome("Rodrigo Pires");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Cliente alterarCliente = dao.consultar("1");
        alterarCliente.setNome("Aleluia da Silva");
        dao.atualizar(alterarCliente);
        Assert.assertEquals("Aleluia da Silva", alterarCliente.getNome());

        List<Cliente> todosClientes = dao.pesquisarTodosClientes();
        assertNotNull(todosClientes);

        Integer qtdDel = dao.excluir(clienteBD);
        assertNotNull(alterarCliente);
    }
}
