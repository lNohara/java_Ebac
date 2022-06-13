package br.com.lnohara.mod15;

public class CarFactoryForUberXDrivers extends Factory{
    @Override
    Car retriveCar(String requestGrade) {
        switch (requestGrade){
            case "A":
                return new RS2011("gray", "Audi", 2011);
            case "B":
                return new Corolla2011("Red", "Toyota", 2011);
            default:
                System.out.println("Invalid grade - UberX Drivers");
                return null;
        }
    }
}
