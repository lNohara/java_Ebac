package br.com.lnohara.mod15.aula02;

public class DemoSingletonPropriedadeThread {
    public static void main(String[] args) {

        Thread foo = new Thread(new ThreadFoo());
        Thread bar = new Thread(new ThreadBar());

        foo.start();
        bar.start();

        //observe que ao trabalhar com threads são feitas duas intâncias em paralelo
        // singleton não é thread save
        // Não há controle de concorrência
    }

    static class ThreadFoo implements Runnable{

        @Override
        public void run() {
            SingtonPropriedade singtonPropriedade = SingtonPropriedade.getIntance("Testes");
            System.out.println(singtonPropriedade.getValue());
        }
    }

    static class ThreadBar implements Runnable{

        @Override
        public void run() {
            SingtonPropriedade singtonPropriedade = SingtonPropriedade.getIntance("Teste1");
            System.out.println(singtonPropriedade.getValue());
        }
    }
}
