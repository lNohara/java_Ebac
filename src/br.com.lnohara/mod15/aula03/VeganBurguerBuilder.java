package br.com.lnohara.mod15.aula03;

public class VeganBurguerBuilder extends BugerBuilder{
    @Override
    void buildBun() {
        burger.setBun("Vegan White Bread");
    }

    @Override
    void buildMeat() {
        burger.setMeat("Vegan Beef");
    }

    @Override
    void buildSalad() {
        burger.setSalad("Vegan Iceberg");
    }

    @Override
    void buildCheese() {
        burger.setCheese("Vegan American Cheese");
    }

    @Override
    void buldSauce() {
        burger.setSauce("Vegan Secret Sauce");
    }
}
