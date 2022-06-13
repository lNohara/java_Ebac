package br.com.lnohara.mod15;

public class CarFactoryForUberComfortDrivers extends Factory{
    @Override
    Car retriveCar(String requestGrade) {
        switch (requestGrade){
            case "A":
                return new RS2012("Blue", "Audi", 2012);
            case "B":
                return new Corolla2012("White", "Toyota", 2012);
            default:
                System.out.println("Invalid Grade - Uber comfort drivers ");
                return null;
        }
    }
}
