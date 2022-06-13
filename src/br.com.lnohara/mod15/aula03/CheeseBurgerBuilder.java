package br.com.lnohara.mod15.aula03;

public class CheeseBurgerBuilder extends BugerBuilder{
    @Override
    void buildBun() {
        burger.setBun("White Bread");
    }

    @Override
    void buildMeat() {
        burger.setMeat("Beef");
    }

    @Override
    void buildSalad() {
        burger.setSalad("Iceberg");
    }

    @Override
    void buildCheese() {
        burger.setCheese("American Cheese");
    }

    @Override
    void buldSauce() {
        burger.setSauce("Secret Sauce");
    }
}
