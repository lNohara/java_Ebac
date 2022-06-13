package br.com.lnohara.mod15;

public class RS2015 extends Car{

    public RS2015(String color, String manufacturer, int year) {
        super(color, manufacturer, year);
    }

    @Override
    public void carDetails() {
        System.out.println("Model: " + getClass().getSimpleName() +
                " - For uber black grade A drivers");
    }

}
