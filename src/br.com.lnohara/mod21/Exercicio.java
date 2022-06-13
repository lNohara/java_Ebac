package br.com.lnohara.mod21;

public class Exercicio {
    public static void main(String[] args) {

        // Implementação Padrão
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Exercício mod 21");
            }
        }).run();

        // Com Lambda
        new Thread(() -> System.out.println("Exercício mod 21")).run();
    }
}
