package br.com.lnohara.mod15;

public abstract class Car {

    private String color;
    private String manufacturer;
    private int year;

    public Car(String color, String manufacturer, int year) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public void carCheckList(){
        System.out.println("The car has been checked by the mechanic");
        System.out.println("the car was cleaned");
    }

    public void carPresentation(){
        System.out.println("A " + color + " " + manufacturer + " released in " + year);
    }

    public abstract void carDetails();
}
