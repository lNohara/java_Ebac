package br.com.lnohara.mod17.aula03.fabrica;

public class Factory implements IFactory {

    @Override
    public FabricaPersistente criarFabrica(String opcaoMenuGeral) {
        if ("1".equals(opcaoMenuGeral)) {
            return new ClienteFabrica();
        } else {
            return null;
            //return new brica();
        }
    }
}
