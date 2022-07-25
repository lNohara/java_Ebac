package br.com.lnohara.mod25.services.generic;

import br.com.lnohara.mod25.dao.generics.IGenericDAO;
import br.com.lnohara.mod25.domain.Persistente;

import java.io.Serializable;
import java.util.Collection;

public abstract class GenericService<T extends Persistente, E extends Serializable> implements IGenericService<T, E>{

    protected IGenericDAO<T,E> dao;

    public GenericService(IGenericDAO<T,E> dao) {
        this.dao = dao;
    }

    @Override
    public Boolean cadastrar(T entity) {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(Long valor) {
        this.dao.excluir(valor);
    }

    @Override
    public void alterar(T entity) {
        this.dao.alterar(entity);
    }

    @Override
    public T consultar(Long valor) {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        return this.dao.buscarTodos();
    }
}
