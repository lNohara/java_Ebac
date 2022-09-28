package br.com.lnohara.mod30.dao.interfaces;

import br.com.lnohara.mod30.dao.generic.IGenericDAO;
import br.com.lnohara.mod30.domain.Venda;
import br.com.lnohara.mod30.exceptions.DAOException;
import br.com.lnohara.mod30.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}