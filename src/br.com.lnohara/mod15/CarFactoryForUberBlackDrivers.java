package br.com.lnohara.mod15;

public class CarFactoryForUberBlackDrivers extends Factory{


    @Override
    Car retriveCar(String requestGrade) {
        switch (requestGrade) {
            case "A":
                return new RS2015("Black", "Audi", 2015);
            case "B":
                return new Corolla2015("Silver", "Toyota", 2015);
            default:
                System.out.println("Invalid Grade - Uber Black Driver");
                return null;
        }
    }
}
