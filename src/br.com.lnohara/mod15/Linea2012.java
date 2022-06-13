package br.com.lnohara.mod15;

public class Linea2012 extends Car{
    public Linea2012(String color, String manufacturer, int year) {
        super(color, manufacturer, year);
    }

    @Override
    public void carDetails() {
        System.out.println("Model: " + getClass().getSimpleName() +
                " - For grade A customers");
    }
}
