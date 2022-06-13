package br.com.lnohara.mod16.aula03;

public class ApartamentoService implements IApartamentoService{
    public void procurarPorEndereco(){
        System.out.println("Procurando apartamento por endereço");
    }
    public void procurarContato(){
        System.out.println("Procurando apartamento por Contato");
    }

    public void procurarValorTotal(){
        System.out.println("Procurando apartamento por valor total");
    }

    @Override
    public void alugarApartamento() {
        procurarPorEndereco();
        procurarContato();
        procurarValorTotal();
    }
}
