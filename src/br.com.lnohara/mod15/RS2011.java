package br.com.lnohara.mod15;

public class RS2011 extends Car{

    public RS2011(String color, String manufacturer, int year) {
        super(color, manufacturer, year);
    }

    @Override
    public void carDetails() {
        System.out.println("Model: " + getClass().getSimpleName() +
                " - For uberX grade A drivers");
    }
}
