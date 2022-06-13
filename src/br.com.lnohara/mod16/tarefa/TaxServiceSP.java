package br.com.lnohara.mod16.tarefa;

public class TaxServiceSP implements ITaxService{
    @Override
    public double tax(double tax) {
        return tax * 0.1;
    }
}
