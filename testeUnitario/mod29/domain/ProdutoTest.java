package mod29.domain;

import br.com.lnohara.mod29.dao.generic.jdbc.produto.IProdutoDAO;
import br.com.lnohara.mod29.dao.generic.jdbc.produto.ProdutoDAO;
import br.com.lnohara.mod29.domain.Cliente;
import br.com.lnohara.mod29.domain.Produto;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    IProdutoDAO produtoDAO = new ProdutoDAO();
    Produto produto = new Produto("Coca-Cola 350ml", 5.00F, 123456789);


    @Test
    public void crudProduto() throws Exception {

        // Create
        Integer qtd = produtoDAO.cadastrar(produto);
        assert (qtd == 1);

        // READ
        Produto produtoConsultado = produtoDAO.consultarProduto(123456789);
        assertNotNull(produtoConsultado);
        assertEquals(produto.getNome(), produtoConsultado.getNome());
        assertEquals(produto.getCodigoDeBarras(), produtoConsultado.getCodigoDeBarras());
        assertEquals(5.00F, produto.getPreco(), produtoConsultado.getPreco());

        // UPDATE
        Produto produtoAlterado = produtoDAO.consultarProduto(123456789);
        produtoAlterado.setNome("Coca-Cola Lata, 350ml");
        produtoAlterado.setPreco(4.50F);
        produtoDAO.alterarProduto(produtoAlterado);

        // READ ALL
        List<Produto> todosProdutos = produtoDAO.pesquisarTodosProdutos();
        assertNotNull(todosProdutos);

        // DELETE
        Integer qtdDel = produtoDAO.excluir(produtoConsultado);
        assertNotNull(produtoConsultado);
    }

}


