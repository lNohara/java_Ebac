package br.com.lnohara.mod17.aula03.fabrica;

import br.com.lnohara.mod17.aula03.domain.Cliente;
import br.com.lnohara.mod17.aula03.domain.Persistente;

public class ClienteFabrica implements FabricaPersistente{
    @Override
    public Persistente criarObjeto(String[] dadosSeparados) {
        return new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
    }

}
