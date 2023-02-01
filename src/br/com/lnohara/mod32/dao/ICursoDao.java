package br.com.lnohara.mod32.dao;

import br.com.lnohara.mod32.domain.Curso;

import java.util.List;

public interface ICursoDao {

    Curso getByCodigo(String codigo);

    public Curso cadastrar (Curso curso);


    Curso consultarPorCodigo(String codigo);

    public List<Curso> consultarTodos();

    public void deletar(String codigo);

    public Curso merge(String codigo, String nome, String descricao);
}
