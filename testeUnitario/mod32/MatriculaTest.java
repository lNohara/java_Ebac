package mod32;

import br.com.lnohara.mod32.dao.IMatriculaDao;
import br.com.lnohara.mod32.dao.MatriculaDao;
import br.com.lnohara.mod32.domain.Matricula;
import org.junit.Test;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.Instant;

import static org.junit.Assert.assertNotNull;

public class MatriculaTest {

    private IMatriculaDao matriculaDao;

    public MatriculaTest() {
        matriculaDao = new MatriculaDao();
    }
    @Test
    public void cadastrar() {
        Matricula mat = new Matricula();
        mat.setCodigo("A1");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("ATIVA");
        mat.setValor(2000d);
        mat= matriculaDao.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());
    }

}
