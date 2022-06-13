package br.com.lnohara.mod15.aula03;

public class BurgerRestaurantDirector {

    private BugerBuilder burgerBuilder;

    public void setBuilder(BugerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public Burger buildBurger(){
        burgerBuilder.buildBun();
        burgerBuilder.buildMeat();
        burgerBuilder.buildSalad();
        burgerBuilder.buildCheese();
        burgerBuilder.buldSauce();
        return burgerBuilder.build();
    }
}
