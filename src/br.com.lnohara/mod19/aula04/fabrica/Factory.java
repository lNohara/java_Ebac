package br.com.lnohara.mod19.aula04.fabrica;

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
