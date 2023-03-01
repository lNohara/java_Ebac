package mod32.tarefa;

import br.com.lnohara.mod32.tarefa.dao.IProdutoDao;
import br.com.lnohara.mod32.tarefa.dao.ProdutoDAO;
import br.com.lnohara.mod32.domain.Curso;
import br.com.lnohara.mod32.tarefa.domain.Produto;
import org.junit.AfterClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProdutoTest {
    private static IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDAO();
    }


    @AfterClass
    public static void end() {
        List<Produto> list = produtoDao.listarTodos();
        list.forEach(produto -> produtoDao.excluir(produto));
    }

    @Test
    public void aCadatrar(){
        Produto produto = new Produto();
        produto.setCodigoDeBarras(12121212L);
        produto.setNome("Coca-Cola Lata 350ml");
        produto.setDescricao("Refrigante de cola");
        produto.setDataFabricacao("2021/10/19");
        produto.setDataVencimento("2023/12/12");
        produto.setValor(5.00);

        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
        assertEquals(Long.valueOf(12121212), produto.getCodigoDeBarras());
        assertEquals("Coca-Cola Lata 350ml", produto.getNome());
        assertEquals("Refrigante de cola", produto.getDescricao());
        assertEquals("2021/10/19", produto.getDataFabricacao());
        assertEquals("2023/12/12", produto.getDataVencimento());
        assertEquals(Double.valueOf(5.00), produto.getValor());

        Produto produto2 = new Produto();
        produto2.setCodigoDeBarras(131313L);
        produto2.setNome("RedBull Lata 430ml");
        produto2.setDescricao("Energético");
        produto2.setDataFabricacao("2022/06/04");
        produto2.setDataVencimento("2023/10/01");
        produto2.setValor(14.00);

        produto2 = produtoDao.cadastrar(produto2);

        assertNotNull(produto2);
        assertNotNull(produto2.getId());
        assertEquals(Long.valueOf(131313), produto2.getCodigoDeBarras());
        assertEquals("RedBull Lata 430ml", produto2.getNome());
        assertEquals("Energético", produto2.getDescricao());
        assertEquals("2022/06/04", produto2.getDataFabricacao());
        assertEquals("2023/10/01", produto2.getDataVencimento());
        assertEquals(Double.valueOf(14.00), produto2.getValor());

    }

    @Test
    public void bConsultarPorCodigo() {
        Produto produto;
        produto = produtoDao.consultarPorCodigoDeBarras(12121212L);

        assertNotNull(produto);
        assertNotNull(produto.getId());
        assertEquals(Long.valueOf(12121212), produto.getCodigoDeBarras());
        assertEquals("Coca-Cola Lata 350ml", produto.getNome());
        assertEquals("Refrigante de cola", produto.getDescricao());
        assertEquals("2021/10/19", produto.getDataFabricacao());
        assertEquals("2023/12/12", produto.getDataVencimento());
        assertEquals(Double.valueOf(5.00), produto.getValor());
    }

    @Test
    public void cConsultarTodos(){

        List allProdutos = produtoDao.consultarTodos();

        assertNotNull(allProdutos);
        assertEquals(2, allProdutos.size());
    }


    @Test
    public void dAtualizarComMerge() {
        Produto produto;
        produto = produtoDao.merge(12121212L, "Coca-Cola Zero Lata 350ml",
                "Refrigerante de cola zero", "2021/10/19", "2023/12/12", 5.50);

        assertNotNull(produto);
        assertNotNull(produto.getId());
        assertEquals(Long.valueOf(12121212), produto.getCodigoDeBarras());
        assertEquals("Coca-Cola Zero Lata 350ml", produto.getNome());
        assertEquals("Refrigerante de cola zero", produto.getDescricao());
        assertEquals("2021/10/19", produto.getDataFabricacao());
        assertEquals("2023/12/12", produto.getDataVencimento());
        assertEquals(Double.valueOf(5.50), produto.getValor());
    }

    @Test
    public void eExcluir() {
        produtoDao.deletarPorCodigoDeBarras(131313L);
    }

    @Test
    public void fConsultarTodos2(){

        List allProdutos = produtoDao.consultarTodos();

        assertNotNull(allProdutos);
        assertEquals(1, allProdutos.size());
    }
}


