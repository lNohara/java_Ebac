package mod30;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Collection;

import br.com.lnohara.mod30.dao.ProdutoDAO;
import br.com.lnohara.mod30.dao.interfaces.IProdutoDAO;
import br.com.lnohara.mod30.domain.Produto;
import br.com.lnohara.mod30.exceptions.DAOException;
import br.com.lnohara.mod30.exceptions.MaisDeUmRegistroException;
import br.com.lnohara.mod30.exceptions.TableException;
import br.com.lnohara.mod30.exceptions.TipoChaveNaoEncontradaException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class ProdutoDAOTest {

    private IProdutoDAO produtoDao;

    public ProdutoDAOTest() {
        produtoDao = new ProdutoDAO();
    }

    @After
    public void end() throws DAOException {
        Collection<Produto> list = produtoDao.buscarTodos();
        list.forEach(prod -> {
            try {
                produtoDao.excluir(prod.getCodigo());
            } catch (DAOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
    }

    private Produto criarProduto(String codigo) throws TipoChaveNaoEncontradaException, DAOException {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setDescricao("Energy Drink");
        produto.setNome("Red Bull Lata 250ml");
        produto.setValidade("Indeterminado");
        produto.setValor(BigDecimal.valueOf(10.99));
        produtoDao.cadastrar(produto);
        return produto;
    }

    private void excluir(String valor) throws DAOException {
        this.produtoDao.excluir(valor);
    }

    @Test
    public void pesquisar() throws MaisDeUmRegistroException, TableException, DAOException, TipoChaveNaoEncontradaException {
        Produto produto = criarProduto("A1");
        Assert.assertNotNull(produto);

        Produto produtoDB = this.produtoDao.consultar(produto.getCodigo());
        Assert.assertNotNull(produtoDB);
        Assert.assertEquals("Indeterminado", produtoDB.getValidade());
        Assert.assertEquals("Red Bull Lata 250ml", produtoDB.getNome());
        Assert.assertEquals("Energy Drink", produtoDB.getDescricao());
        Assert.assertEquals(BigDecimal.valueOf(10.99), produtoDB.getValor());

        excluir(produtoDB.getCodigo());
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
        Produto produto = criarProduto("A2");
        Assert.assertNotNull(produto);
        excluir(produto.getCodigo());
    }

    @Test
    public void excluir() throws DAOException, TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException {
        Produto produto = criarProduto("A3");
        Assert.assertNotNull(produto);
        excluir(produto.getCodigo());
        Produto produtoBD = this.produtoDao.consultar(produto.getCodigo());
        assertNull(produtoBD);
    }

    @Test
    public void alterarProduto() throws TipoChaveNaoEncontradaException, DAOException, MaisDeUmRegistroException, TableException {
        Produto produto = criarProduto("A4");
        produto.setNome("Coca-Cola Lata 350ml");
        produto.setDescricao("Refrigerante");
        produto.setValor(BigDecimal.valueOf(5.99));
        produto.setValidade("2025-12-30");
        produtoDao.alterar(produto);
        Produto produtoBD = this.produtoDao.consultar(produto.getCodigo());
        assertNotNull(produtoBD);
        Assert.assertEquals("Coca-Cola Lata 350ml", produtoBD.getNome());
        Assert.assertEquals("2025-12-30", produtoBD.getValidade());
        Assert.assertEquals("Refrigerante", produto.getDescricao());
        Assert.assertEquals(BigDecimal.valueOf(5.99), produto.getValor());


        excluir(produto.getCodigo());
        Produto produtoBD1 = this.produtoDao.consultar(produto.getCodigo());
        assertNull(produtoBD1);
    }

    @Test
    public void buscarTodos() throws DAOException, TipoChaveNaoEncontradaException {
        criarProduto("A5");
        criarProduto("A6");
        Collection<Produto> list = produtoDao.buscarTodos();
        assertTrue(list != null);
        assertTrue(list.size() == 2);

        for (Produto prod : list) {
            excluir(prod.getCodigo());
        }

        list = produtoDao.buscarTodos();
        assertTrue(list != null);
        assertTrue(list.size() == 0);

    }
}