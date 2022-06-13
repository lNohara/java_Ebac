package br.com.lnohara.mod11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestePerformanceList {

    public static void main(String[] args) {
        testeLinkedListRemove();
        testeLinkedListAd();

        testeArrayListRemove();
        testeArrayListAdd();
    }

    private static void testeLinkedListRemove(){
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();
        List<Integer> lista = new LinkedList<>();
        for(int i = 0; i < MAX; i++){
            lista.add(i);
        }

        for (int i = MAX -1; i > 0 ; i--){
            lista.remove(i);
        }

        long tFim = System.currentTimeMillis();
        System.out.println("Tempo toal LinkedList Remove: " + (tFim - tInicio));
    }

    private static void testeLinkedListAd(){
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();
        List<Integer> lista = new LinkedList<>();
        for(int i = 0; i < MAX; i++){
            lista.add(i);
        }
        for(int i =0; i < MAX; i++){
            lista.contains(i);
        }
        long tFim = System.currentTimeMillis();
        System.out.println("Tempo total LinkedList add: " + (tFim - tInicio));
    }

    private static void testeArrayListRemove(){
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < MAX; i++){
            list.add((i));
        }

        for (int i = MAX -1; i > 0; i--){
            list.remove(i);
        }
        long tFim = System.currentTimeMillis();
        System.out.println("Tempo total ArrayList Remove: " + (tFim - tInicio));
    }


    private static void testeArrayListAdd(){
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < MAX; i ++){
            lista.add(i);
        }

        for(int i = 0; i < MAX; i++){
            lista.contains(i);
        }
        long tFim = System.currentTimeMillis();
        System.out.println("Tempo total ArrayList add: " + (tFim - tInicio));
    }

}

