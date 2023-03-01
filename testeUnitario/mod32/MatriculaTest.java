package mod32;

import br.com.lnohara.mod32.dao.CursoDao;
import br.com.lnohara.mod32.dao.ICursoDao;
import br.com.lnohara.mod32.dao.IMatriculaDao;
import br.com.lnohara.mod32.dao.MatriculaDao;
import br.com.lnohara.mod32.domain.Curso;
import br.com.lnohara.mod32.domain.Matricula;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.time.Instant;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MatriculaTest {

    private static IMatriculaDao matriculaDao;
    private static ICursoDao cursoDao;

    public MatriculaTest() {
        matriculaDao = new MatriculaDao();
        cursoDao = new CursoDao();
    }

    private Curso criarCurso(String codigo, String nome, String descricao) {
        Curso curso = new Curso();
        curso.setCodigo(codigo);
        curso.setDescricao(nome);
        curso.setNome(descricao);
        return cursoDao.cadastrar(curso);
    }

    @AfterClass
    public static void end() {
        List<Matricula> list = matriculaDao.buscarTodos();
        list.forEach(mat -> matriculaDao.excluir(mat));

        List<Curso> listCursos = cursoDao.consultarTodos();
        listCursos.forEach(cur -> cursoDao.excluir(cur));
    }

    @Test
    public void aCadastrar() {
        Curso curso = criarCurso("B1", "HTML5", "Linguagem de Marcação");
        Matricula mat = new Matricula();
        mat.setCodigo("A1");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("ATIVA");
        mat.setValor(2000d);
        mat.setCurso(curso);
        mat= matriculaDao.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());
        assertEquals("A1", mat.getCodigo());
        assertEquals("ATIVA", mat.getStatus());
        assertEquals(curso.getId(), mat.getCurso().getId());
        Assert.assertEquals(Double.valueOf(2000.0), mat.getValor());
    }


    @Test
    public void bPesquisarPorCodigoCurso() {
        Curso curso = criarCurso("B2", "Segurança da informação", "Segurança com enfase em LGPD");
        Matricula mat = new Matricula();
        mat.setCodigo("A2");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("ATIVA");
        mat.setValor(1000d);
        mat.setCurso(curso);
        mat = matriculaDao.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());

        Matricula matricBD = matriculaDao.buscarPorCodigoCurso(curso.getCodigo());
        assertNotNull(matricBD);
        assertEquals(mat.getId(), matricBD.getId());
        assertEquals(mat.getStatus(), matricBD.getStatus());
        Assert.assertEquals(mat.getValor(), matricBD.getValor());
    }

    @Test
    public void cPesquisarPorCodigoCursoCriteria() {
        Curso curso = criarCurso("B3", "OO", "Fundamentos da Orientação a objetos");
        Matricula mat = new Matricula();
        mat.setCodigo("A3");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("INATIVA");
        mat.setValor(1999.98d);
        mat.setCurso(curso);
        mat = matriculaDao.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());

        Matricula matricBD = matriculaDao.buscarPorCodigoCursoCriteria(curso.getCodigo());
        assertNotNull(matricBD);
        assertEquals(mat.getId(), matricBD.getId());
        assertEquals(mat.getStatus(), matricBD.getStatus());
    }


    @Test
    public void dPesquisarPorCodigoMatricula() {
        Matricula mat = matriculaDao.buscarPorCodigoMatriculaCriteria("A1");
        Curso curso = mat.getCurso();
        assertNotNull(mat);
        assertNotNull(mat.getId());
        assertEquals("A1", mat.getCodigo());
        assertEquals("ATIVA", mat.getStatus());
        assertEquals(curso.getId(), mat.getCurso().getId());
        Assert.assertEquals(Double.valueOf(2000.0), mat.getValor());
    }

    @Test
    public void eConsultarTodos(){

        List allMatriculas = matriculaDao.buscarTodos();

        assertNotNull(allMatriculas);
        assertEquals(3, allMatriculas.size());
    }
}
