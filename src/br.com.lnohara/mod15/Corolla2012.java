package br.com.lnohara.mod15;

public class Corolla2012 extends Car{

    public Corolla2012(String color, String manufacturer, int year) {
        super(color, manufacturer, year);
    }

    @Override
    public void carDetails() {
        System.out.println("Model: " + getClass().getSimpleName() +
                " - For uber comfort grade B drivers");
    }
}
