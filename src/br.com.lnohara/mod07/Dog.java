package br.com.lnohara.mod07;

public class Dog {

    private String race;
    private double size;
    private double weight;
    private String name;

    /**
     *
     * @return the dog's race
     */
    public String getRace() {
        return race;
    }

    /**
     *
     * @param race race to set
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     *
     * @return the dog's size
     */
    public double getSize() {
        return size;
    }

    /**
     *
     * @param size size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     *
     * @return the dog's weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     *
     * @param weight weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     *
     * @return the dog's name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @autor Renata Nohara
     *
     * @since 2021/11/04
     *
     * @deprecated
     * @see public void bark(Double size)
     */
    public void makeNoise(){
        System.out.println("bark bark");
    }

    /**
     * @autor Renata Nohara
     *
     * @since 2021/11/04
     *
     * @param size the size to define how the dog will bark
     * @see <a href="https://www.omnicalculator.com/biology/dog-size">Dog size calculator</a>
     */
    public void bark(Double size){
        if (this.size <= 10){
            System.out.println("yelp yelp yelp");
        } else if (this.size > 10 && this.size <=20){
            System.out.println("ruff ruff ruff");
        } else{
            System.out.println("woof woof");
        }
    }

    /**
     * @autor Renata Nohara
     * @version v1
     */
    public void sleep(){}

}
