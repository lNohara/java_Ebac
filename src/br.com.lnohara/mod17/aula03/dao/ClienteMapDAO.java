package br.com.lnohara.mod17.aula03.dao;

import br.com.lnohara.mod17.aula03.SingletonMap;
import br.com.lnohara.mod17.aula03.dao.generic.GenericDAO;
import br.com.lnohara.mod17.aula03.domain.Cliente;

import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO{

    public ClienteMapDAO() {
        super();
        Map<Long, Cliente> mapaInterno =
                (Map<Long, Cliente>) SingletonMap.getInstance().getMap().get(getTipoClasse());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            SingletonMap.getInstance().getMap().put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente cliente, Cliente entityCadastrado) {
        entityCadastrado.setNome(cliente.getNome());
        entityCadastrado.setTel(cliente.getTel());
        entityCadastrado.setNumero(cliente.getNumero());
        entityCadastrado.setEnd(cliente.getEnd());
        entityCadastrado.setCidade(cliente.getCidade());
        entityCadastrado.setEstado(cliente.getEstado());
    }

//    private Map<Long, Cliente> map;
//
//    public ClienteMapDAO() {
//        this.map = new HashMap<>();
//    }
//
//    @Override
//    public Boolean cadastrar(Cliente cliente) {
//       if(this.map.containsKey(cliente.getCpf())){
//           return false;
//       }
//       this.map.put(cliente.getCpf(), cliente);
//       return true;
//    }
//
//    @Override
//    public void excluir(Long cpf) {
//        Cliente clienteCadastrado = this.map.get(cpf);
//        map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
//    }
//
//    @Override
//    public void alterar(Cliente cliente) {
//        Cliente clienteCadastrado = map.get(cliente.getCpf());
//        clienteCadastrado.setNome(cliente.getNome());
//        clienteCadastrado.setTel(cliente.getTel());
//        clienteCadastrado.setNumero(cliente.getNumero());
//        clienteCadastrado.setEnd(cliente.getEnd());
//        clienteCadastrado.setCidade(cliente.getCidade());
//        clienteCadastrado.setEstado(cliente.getEstado());
//    }
//
//    @Override
//    public Cliente consultar(Long cpf) {
//        return this.map.get(cpf);
//    }
//
//    @Override
//    public Collection<Cliente> buscarTodos() {
//        return this.map.values();
//    }
}
