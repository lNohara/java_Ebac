package br.com.lnohara.mod21.aula04;

import java.text.RuleBasedCollator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Aula04 {
    public static void main(String[] args) {

        Runnable helloWorld = () -> System.out.println("Hello World");

        Consumer<String> stringConsumer =  (String s) -> {
            System.out.println(s);
        };
        stringConsumer.accept("Value");

        Supplier<Integer> integerCallable = () -> 40;

        Supplier<Double> doubleSupplier = () -> {
            return 656.4d;
        };

        // Threads sem lambda
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable sem lambda");
            }
        };
        new Thread(r).start();

        // Threds com lambda, mesma coisa com menos código
        Runnable rLambda = () -> System.out.println("Runnable com lambda");
        new Thread(rLambda).start();

        // A Thread recebe uma interface funcional como parâmetro
        // Dá para economizar mais ainda
        new Thread(() -> System.out.println("Runnable com lambda + interface funcional")).start();
    }
}
