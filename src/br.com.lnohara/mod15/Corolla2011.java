package br.com.lnohara.mod15;

public class Corolla2011 extends Car{

    public Corolla2011(String color, String manufacturer, int year) {
        super(color, manufacturer, year);
    }

    @Override
    public void carDetails() {
        System.out.println("Model: " + getClass().getSimpleName() +
                " - For uberX grade B drivers");
    }
}
