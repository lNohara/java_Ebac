package mod30;

import java.math.BigDecimal;

import br.com.lnohara.mod30.dao.interfaces.IProdutoDAO;
import br.com.lnohara.mod30.domain.Produto;
import br.com.lnohara.mod30.exceptions.DAOException;
import br.com.lnohara.mod30.exceptions.TipoChaveNaoEncontradaException;
import br.com.lnohara.mod30.services.IProdutoService;
import br.com.lnohara.mod30.services.ProdutoService;
import mod30.dao.ProdutoDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProdutoServiceTest {

    private IProdutoService produtoService;

    private Produto produto;

    public ProdutoServiceTest() {
        IProdutoDAO dao = new ProdutoDaoMock();
        produtoService = new ProdutoService(dao);
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Refrigerante zero");
        produto.setNome("Guaraná zero lata 350");
        produto.setValor(BigDecimal.valueOf(4.90));
    }

    @Test
    public void pesquisar() throws DAOException {
        Produto produtor = this.produtoService.consultar(produto.getCodigo());
        Assert.assertNotNull(produtor);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
        Boolean retorno = produtoService.cadastrar(produto);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluir() throws DAOException {
        produtoService.excluir(produto.getCodigo());
    }

    @Test
    public void alterar() throws TipoChaveNaoEncontradaException, DAOException {
        produto.setNome("Everlast lata 435ml");
        produto.setValidade("10/05/2024");
        produtoService.alterar(produto);

        Assert.assertEquals("Everlast lata 435ml", produto.getNome());
        Assert.assertEquals("10/05/2024", produto.getValidade());
    }
}