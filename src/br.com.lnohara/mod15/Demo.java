package br.com.lnohara.mod15;

public class Demo {
    public static void main(String[] args) {

        constructor("A", "Uber Black Driver");
        constructor("B", "Uber Black Driver");

        constructor("A", "Uber Comfort Driver");
        constructor("B", "Uber Comfort Driver");

        constructor("A", "UberX Driver");
        constructor("B", "UberX Driver");

        constructor("A", "Regular Driver");
        constructor("B", "Regular Druver");
    }

    private static Factory getFactory(Customer customer){
        if(customer.getCustomerType().equalsIgnoreCase("Uber Black Driver")){
            return new CarFactoryForUberBlackDrivers();
        }
        else if(customer.getCustomerType().equalsIgnoreCase("Uber Comfort Driver")){
            return new CarFactoryForUberComfortDrivers();
        } else if(customer.getCustomerType().equalsIgnoreCase("UberX Driver")){
            return new CarFactoryForUberXDrivers();
        } else {
            return new CarFactoryForRegularDrivers();
        }
    }

    public static void constructor(String grade, String customerType){
        Customer customer = new Customer(grade, customerType);
        Factory factory = getFactory(customer);
        Car car = factory.create(customer.getGradeRequest());
    }
}
