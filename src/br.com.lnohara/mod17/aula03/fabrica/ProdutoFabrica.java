package br.com.lnohara.mod17.aula03.fabrica;

import br.com.lnohara.mod17.aula03.domain.Persistente;
import br.com.lnohara.mod17.aula03.domain.Produto;

public class ProdutoFabrica implements FabricaPersistente {
    @Override
    public Persistente criarObjeto(String[] dados) {
        Produto produto = new Produto();
        produto.setCodigo(Long.parseLong(dados[0].trim()));
        produto.setNome(dados[1]);
        return produto;
    }
}
