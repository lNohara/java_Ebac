package br.com.lnohara.mod19.aula04.fabrica;

import br.com.lnohara.mod19.aula04.domain.Cliente;
import br.com.lnohara.mod19.aula04.domain.Persistente;

public class ClienteFabrica implements FabricaPersistente {
    @Override
    public Persistente criarObjeto(String dadosSeparados[]) {
        return new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
    }

}
