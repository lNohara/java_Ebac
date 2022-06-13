package br.com.lnohara.mod16.aula01;

public class Demo {
    public static void main(String[] args) {
        Trabalhador bombeiro = new Bombeiro();
        bombeiro.executarRotina();

        Trabalhador policial = new Policial();
        policial.executarRotina();

        Trabalhador advogado = new Advogado();
        advogado.executarRotina();

        Trabalhador medico = new Medico();
        medico.executarRotina();
    }
}
