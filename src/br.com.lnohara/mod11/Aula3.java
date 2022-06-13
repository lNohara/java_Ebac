package br.com.lnohara.mod11;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula3 {

    public static void main(String[] args) {
        priorityQueue();
        acessandoDaFila();
        removendoDaFila();
        inserindoNaFila();
    }

    public static void priorityQueue(){
        //Ordenação Natural
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("short");
        queue.add("very long indeed");
        queue.add("medium");
        while (queue.size() != 0){
            System.out.println(queue.remove());
        }
        System.out.println();
    }

    private static void acessandoDaFila(){
        System.out.println("**** ACESSANDO ****");
        Deque<String> ad = new ArrayDeque<>();
        ad.add("Red");
        ad.add("Blue");
        ad.add("White");
        ad.add("Yellow");
        ad.add("Black");

        Deque<String> d = new ArrayDeque<>();
        d.add("Green");
        d.add("Orange");

        ad.addAll(d);

        System.out.println(ad);
        System.out.println(ad.contains("White"));
        System.out.println(d.contains("Brown"));
        System.out.println(ad.containsAll(d));

        System.out.println("Output of element: " + ad.element());
        System.out.println("Get first element using getFirst: " + ad.getFirst());
        System.out.println("Get last element using getLast: " + ad.getLast());
        System.out.println("Output of peek: " + ad.peek());
        System.out.println("Get first element using peekFirst: " + ad.peekFirst());
        System.out.println("Get last element using peekLast: " + ad.peekLast());
        System.out.println();
    }

    private static void removendoDaFila(){
        System.out.println("**** REMOVENDO ****");
        Deque<String> ad = new ArrayDeque<>();
        ad.add("Red");
        ad.add("Blue");
        ad.add("White");
        ad.add("Yellow");
        ad.add("Black");

        Deque<String> d = new ArrayDeque<>();
        d.add("Pink");
        d.add("Green");
        d.add("Purple");
        d.add("Orange");
        d.add("Brown");

        ad.addAll(d);
        System.out.println("Elements in the ArrayDeque: " + ad);
        System.out.println();

        String val = ad.remove();
        ad.remove("Black");
        System.out.println("Remove o black");
        System.out.println("Elements in the ArrayDeque: " + ad);
        System.out.println();

        ad.removeFirst();
        System.out.println("Remove o Black");
        System.out.println("Elements in the ArrayDeque: " + ad);
        System.out.println();

        ad.removeLast();
        System.out.println("Remove o ultimo");
        System.out.println("Elements in the ArrayDeque: " + ad);
        System.out.println();

        ad.poll();
        ad.pollFirst();
        ad.pollLast();
        System.out.println("Elements in the ArrayDeque: " + ad);

        ad.pop();
        System.out.println("Elements in the ArrayDeque: " + ad);

        ad.retainAll(d);
        System.out.println("Elements in the ArrayDeque: " + ad);

        ad.removeAll(d);
        System.out.println("Elements in the ArrayDeque: " + ad);
    }

    private static void inserindoNaFila(){
        System.out.println("**** INSERINDO ****");

        Deque<String> d = new ArrayDeque<>();
        d.add("Delhi");
        d.addFirst("Bangalore");
        d.addLast("Chenmai");

        System.out.println("Elements in the Deque after add, addFirst and addLast " + d);

        Deque<String> dq = new ArrayDeque<>();
        dq.add("a");
        dq.add("b");

        d.addAll(dq);

        System.out.println("Elements in the Deque after addAll: " + d);
    }
}
