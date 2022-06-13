package br.com.lnohara.mod16.tarefa;

public class TaxServiceAC implements ITaxService{
    @Override
    public double tax(double tax) {
        return tax * 0.5;
    }
}
