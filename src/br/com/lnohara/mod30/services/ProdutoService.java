package br.com.lnohara.mod30.services;

import br.com.lnohara.mod30.dao.interfaces.IProdutoDAO;
import br.com.lnohara.mod30.domain.Produto;
import br.com.lnohara.mod30.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}