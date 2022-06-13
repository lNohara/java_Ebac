package br.com.lnohara.mod16.tarefa;

public class PayService {

    /**
     * Eu dependo de uma instância do TaxService
     * e do DelverService para poder colcular meu finalPrice
     */
    private ITaxService taxService;

    public PayService(ITaxService taxService){
        this.taxService = taxService;
    }

    public double finalPrice(Double cost){
        return cost + taxService.tax(cost);
    }
}
