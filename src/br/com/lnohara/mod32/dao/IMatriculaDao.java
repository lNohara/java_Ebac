package br.com.lnohara.mod32.dao;

import br.com.lnohara.mod32.domain.Curso;
import br.com.lnohara.mod32.domain.Matricula;

import java.util.List;

public interface IMatriculaDao {

    public Matricula cadastrar (Matricula mat);
    public Matricula buscarPorCodigoCurso(String codigoCurso);

    public Matricula buscarPorCodigoCursoCriteria(String codigoCurso);
    public Matricula buscarPorCodigoMatriculaCriteria(String codigo);

    public List<Matricula> buscarTodos();
    public void excluir(Matricula matricula);

}
