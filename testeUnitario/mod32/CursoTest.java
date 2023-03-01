package mod32;

import br.com.lnohara.mod32.dao.CursoDao;
import br.com.lnohara.mod32.dao.ICursoDao;
import br.com.lnohara.mod32.domain.Curso;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;


import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CursoTest {

    private ICursoDao cursoDao;

    public CursoTest() {
        cursoDao = new CursoDao();
    }


    @Test
    public void aCadsatrar() {
        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setDescricao("CURSO TESTE");
        curso.setNome("Curso de java Backend");
        curso = cursoDao.cadastrar(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());
        assertEquals("A1", curso.getCodigo());
        assertEquals("CURSO TESTE", curso.getDescricao());
        assertEquals("Curso de java Backend", curso.getNome());
    }
    @Test
    public void bConsultarPorCodigo() {
        Curso curso;
        curso = cursoDao.consultarPorCodigo("A1");

        assertNotNull(curso);
        assertNotNull(curso.getId());
        assertEquals("A1", curso.getCodigo());
        assertEquals("CURSO TESTE", curso.getDescricao());
        assertEquals("Curso de java Backend", curso.getNome());
    }

    @Test
    public void cConsultarTodos(){

        List allCursos = cursoDao.consultarTodos();

        assertNotNull(allCursos);
        assertEquals(1, allCursos.size());
    }

    @Test
    public void dAtualizarComMerge() {
        Curso curso;
        curso = cursoDao.merge("A1", "Curso de Java Script", "Fundamentos do Java Scipt");

        assertNotNull(curso);
        assertNotNull(curso.getId());
        assertEquals("A1", curso.getCodigo());
        assertEquals("Curso de Java Script", curso.getNome());
        assertEquals("Fundamentos do Java Scipt", curso.getDescricao());
    }


    @Test
    public void eExcluir() {
        cursoDao.deletar("A1");
    }

    @Test
    public void fConsultarTodosVazio(){

        List allCursos = cursoDao.consultarTodos();

        assertNotNull(allCursos);
        assertEquals(0, allCursos.size());
    }

}

