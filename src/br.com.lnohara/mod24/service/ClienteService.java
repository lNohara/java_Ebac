package br.com.lnohara.mod24.service;

import br.com.lnohara.mod24.dao.inteterfaces.IClienteDao;
public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao){
        this.clienteDao = clienteDao;
    }

    public String salvar(){
        clienteDao.salvar();
        return  "Sucesso";
    }
}
