package br.com.lnohara.mod16.tarefa;

public class Demo {

    public static void main(String[] args) {
        TaxServiceSP taxServiceSP = new TaxServiceSP();
        TaxServiceAC taxServiceAC = new TaxServiceAC();

        PayService payService = new PayService(taxServiceSP);
        PayService payService2 = new PayService(taxServiceAC);

        System.out.println("Frete: " + payService.finalPrice(500.0));
        System.out.println("Frete: " + payService2.finalPrice(500.0));
    }
}
