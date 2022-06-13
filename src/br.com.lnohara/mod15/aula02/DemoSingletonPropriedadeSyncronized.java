package br.com.lnohara.mod15.aula02;

public class DemoSingletonPropriedadeSyncronized {

    public static void main(String[] args) {
        Thread foo = new Thread(new DemoSingletonPropriedadeThread.ThreadFoo());
        Thread bar = new Thread(new DemoSingletonPropriedadeThread.ThreadBar());

        foo.start();
        bar.start();

        // o synchronized garante que entra apenas uma execução por vez
        // Lembrando: o synchronized pode travar o projeto todo, ele diminui a performance
    }

    static class ThreadFoo implements Runnable{

        @Override
        public void run() {
            SingletonPropriedadeSyncronized singletonPropriedadeSyncronized = SingletonPropriedadeSyncronized.getInstance("Teste");
            System.out.println(singletonPropriedadeSyncronized.getValue());
        }
    }

    static class ThreadBar implements Runnable{

        @Override
        public void run() {
            SingletonPropriedadeSyncronized singletonPropriedadeSyncronized = SingletonPropriedadeSyncronized.getInstance("Teste");
            System.out.println(singletonPropriedadeSyncronized.getValue());
        }
    }
}


