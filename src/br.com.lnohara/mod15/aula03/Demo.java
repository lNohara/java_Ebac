package br.com.lnohara.mod15.aula03;

public class Demo {
    public static void main(String[] args) {
        BurgerRestaurantDirector burgerRestaurant = new BurgerRestaurantDirector();
        burgerRestaurant.setBuilder(new CheeseBurgerBuilder());
        buildBurger(burgerRestaurant);

        burgerRestaurant.setBuilder(new VeganBurguerBuilder());
        buildBurger(burgerRestaurant);
    }

    private static void buildBurger(BurgerRestaurantDirector burgerRestaurant){
        Burger burger = burgerRestaurant.buildBurger();
        System.out.println(burger.toString());
    }
}
