package br.com.lnohara.mod15;

public class Linea2011 extends Car{
    public Linea2011(String color, String manufacturer, int year) {
        super(color, manufacturer, year);
    }

    @Override
    public void carDetails() {
        System.out.println("Model: " + getClass().getSimpleName() +
                " - For grade B customers");
    }
}
