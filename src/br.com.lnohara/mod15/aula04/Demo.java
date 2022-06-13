package br.com.lnohara.mod15.aula04;

public class Demo {

    public static void main(String[] args) {
        Customer customerOne = new Customer("B", true);
        Factory factory = getFactory(customerOne);
        Car carOne = factory.create(customerOne.getGradeRequest());
        carOne.startEngine();
    }

    private static Factory getFactory(Customer customer){
        if(customer.isHasCompanyContract()){
            return new CompanyCarFactory();
        } else {
            return new CarFactory();
        }
    }
}
