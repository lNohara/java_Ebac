package br.com.lnohara.mod16.aula03;

public class Demo {
    public static void main(String[] args) {
        IApartamentoService service = new ApartamentoService();
        service.alugarApartamento();
    }
}
