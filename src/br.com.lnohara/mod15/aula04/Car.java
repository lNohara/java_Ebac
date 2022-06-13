package br.com.lnohara.mod15.aula04;

public abstract class Car {

    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine(){
        System.out.println("The " + fuelSource + " engine has been startd, and is ready to utilize " + horsePower);
    }

    public void clean() {
        System.out.println("Car has ben cleaned, and the " + color.toLowerCase() + " color shines");
    }

    public void mechanicCheck(){
        System.out.println("Car has been checked by the mechanic. Everything looks good");
    }

    public void fuelCar(){
        System.out.println("Car is being filled with " + fuelSource.toLowerCase());
    }

}
