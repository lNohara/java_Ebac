package br.com.lnohara.mod15.aula03;

public class Burger {

    private String bun = "No bun";
    private String meat = "No meat";
    private String salad = "No Salad";
    private String cheese = "No Cheese";
    private String sauce = "No Sauce";

    public void setBun(String bun){
        this.bun = bun;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public static void print(){
        System.out.println("Burguer is finished! " + "n" +
                "Bun: " );
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", salad='" + salad + '\'' +
                ", cheese='" + cheese + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
