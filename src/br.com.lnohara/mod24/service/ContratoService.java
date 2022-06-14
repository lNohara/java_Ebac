package br.com.lnohara.mod24.service;

import br.com.lnohara.mod24.dao.inteterfaces.IContratoDao;

public class ContratoService implements IContratoService {
    private IContratoDao contratoDao;
    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Resultados encontrados";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualizado com sucesso";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Contrato excluído";
    }
}
