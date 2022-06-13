package br.com.lnohara.mod15.aula04;

public class CarFactory extends Factory{
    @Override
    Car retriveCar(String requestGrade) {
        switch (requestGrade){
            case "A":
                return new Volkswagem(1000, "full", "blue");
            case "B":
                return new Toyota(900, "full", "blue");
            default:
                System.out.println("The requested car was unfortunately not available");
                return null;
        }
    }
}
