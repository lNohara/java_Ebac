package br.com.lnohara.mod17.fruta;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Maca());
        frutas.add(new Banana());

        imprimirFrutas(frutas);

    }

    public static void imprimirFrutas(List<Fruta> lista){
        for (Fruta fruta : lista){
            System.out.println(fruta);
        }
    }

    // Posso receber qualquer coisa que extenda fruta
    public static void imprimirFrutas2(List<? extends Fruta> lista){
        for (Fruta fruta : lista){
            System.out.println(fruta);
        }
    }

    public static void imprimirFrutas3(List<? super Object> lista){
        for (Object fruta : lista){
            System.out.println(fruta);
        }
    }
}
