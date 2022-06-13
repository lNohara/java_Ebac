package br.com.lnohara.mod15.aula04;

public class CompanyCarFactory extends Factory{

    @Override
    Car retriveCar(String requestGrade) {
        switch (requestGrade){
            case "A":
                return new Tesla(1000, "full", "blue");
            case "B":
                return new Audi(800, "full", "red");
            default:
                System.out.println("The request car was unfortunately not avaliable.");
                return null;
        }
    }
}
