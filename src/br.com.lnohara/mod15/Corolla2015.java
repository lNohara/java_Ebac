package br.com.lnohara.mod15;

public class Corolla2015 extends Car{

    public Corolla2015(String color, String manufacturer, int year) {
        super(color, manufacturer, year);
    }

    @Override
    public void carDetails() {
        System.out.println("Model: " + getClass().getSimpleName() +
                " - For uber black grade B drivers");
    }
}
