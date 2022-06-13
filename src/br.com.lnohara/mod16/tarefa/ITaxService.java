package br.com.lnohara.mod16.tarefa;

public interface ITaxService {
    public default double tax(double tax){
        return tax * 0.3;
    }
}
