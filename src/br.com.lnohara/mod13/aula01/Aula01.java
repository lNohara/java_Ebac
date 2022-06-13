package br.com.lnohara.mod13.aula01;

public class Aula01 {
    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Ola Renata");
        caneta.escreverComumATodas();
        System.out.println(caneta.getCor());

        System.out.println("**********************");

        ICaneta giz = new Giz();
        giz.escrever("Ola Renata");
        giz.escreverComumATodas();
        System.out.println(giz.getCor());

        System.out.println("**********************");

        ICaneta lapis = new Lapis();
        lapis.escrever("Ola Renata");
        lapis.escreverComumATodas();
        System.out.println(lapis.getCor());

        System.out.println("**********************");

        ICarro carro = new CarroPasseio();
        carro.andar();
        carro.parar();

        System.out.println("**********************");

        ICarro caminhao = new Caminhao();
        caminhao.andar();
        caminhao.parar();
    }
}
