package br.com.lnohara.mod24.dao;

import br.com.lnohara.mod24.dao.inteterfaces.IContratoDao;

public class ContratoDao implements IContratoDao {
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona sem config com o banco");
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Não funciona sem config com o banco");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Não funciona sem config com o banco");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não funciona sem config com o banco");
    }
}
