package br.com.lnohara.mod12;

import java.util.*;

public class Aula03 {
    public static void main(String[] args) {
        //exemploHashMap();
        //exemploTreeMap();
        exemploSalaAula();
    }

    /**
     * @author rodrigo.pires
     *
     * Permite chaves e valores null. Não existe garantia que os dados ficarão ordenados.
     *
     * Para usar uma classe que implementa Map, quaisquer classes que forem utilizadas como chave
     * devem sobrescrever os métodos hashCode() e equals().
     */
    public static void exemploHashMap(){
        System.out.println("***** exemploHashMap *****");
        exemploListaSimples();
        exemploListaSimplesIterandoValores();
        exemploListaSimplesIterandoChaves();
        exemploListaSimplesIterandoChaveValor();
    }
    private static void exemploListaSimplesIterandoChaveValor() {
        System.out.println("****** exemploListaSimplesIterandoChaveValor ******");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");

        System.out.println("***** for comum *****");
        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for (Map.Entry<Integer, String> e : entry) {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }

        System.out.println("***** forEach stream *****");
        lista.entrySet().forEach(e -> {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        });

        System.out.println("***** forEach stream 1 *****");
        lista.keySet().stream().forEach(System.out::println);

        System.out.println("***** forEach stream 2 *****");
        lista.values().stream().forEach(System.out::println);

        System.out.println("***** forEach stream 3 *****");
        lista.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("***** iterator *****");
        Iterator<Map.Entry<Integer, String>> it = lista.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, String> entry1 = it.next();
            System.out.println("Chave: " + entry1.getKey());
            System.out.println("Valor: " + entry1.getValue());
        }
    }

    private static void exemploListaSimplesIterandoChaves() {
        System.out.println("****** exemploListaSimplesIterandoChaves ******");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");

        for (Integer value : lista.keySet()) {
            System.out.println(value);
        }
    }

    private static void exemploListaSimplesIterandoValores() {
        System.out.println("****** exemploListaSimplesIterandoValores ******");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");
        for (String value : lista.values()) {
            System.out.println(value);
        }
    }

    /**
     * Chave nunca se repete
     * pode ser retirado do mapa por chave
     */
    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(4, "João da Silva");
        lista.put(3, "Lúcia Ferreira");

        System.out.println(lista);
        System.out.println("");
    }

    public static void exemploTreeMap(){
        System.out.println("***** exemploTreeMap *****");
        exemploListaSimplesTM();
        exemploListaSimplesIterandoChaveValorTM();
        exemploListaSimplesIterandoChavesTM();
        exemploListaSimplesIterandoValoresTM();
        exemploListaSimplesPegandoPelaChaveTM();
    }

    private static void exemploListaSimplesPegandoPelaChaveTM() {
        System.out.println("****** exemploListaSimplesPegandoPelaChave ******");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");

        String nome = lista.get(3);
        System.out.println(nome);
    }

    private static void exemploListaSimplesIterandoChaveValorTM() {
        System.out.println("****** exemploListaSimplesIterandoChaveValor ******");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");

        System.out.println("***** for comum *****");
        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for (Map.Entry<Integer, String> e : entry) {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }

        System.out.println("***** forEach stream *****");
        lista.entrySet().forEach(e -> {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        });

        System.out.println("***** forEach stream 1 *****");
        lista.keySet().stream().forEach(System.out::println);

        System.out.println("***** forEach stream 2 *****");
        lista.values().stream().forEach(System.out::println);

        System.out.println("***** forEach stream 3 *****");
        lista.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("***** iterator *****");
        Iterator<Map.Entry<Integer, String>> it = lista.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, String> entry1 = it.next();
            System.out.println("Chave: " + entry1.getKey());
            System.out.println("Valor: " + entry1.getValue());
        }
    }

    private static void exemploListaSimplesIterandoChavesTM() {
        System.out.println("****** exemploListaSimplesIterandoChaves ******");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");

        for (Integer value : lista.keySet()) {
            System.out.println(value);
        }
    }

    private static void exemploListaSimplesIterandoValoresTM() {
        System.out.println("****** exemploListaSimplesIterandoValores ******");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");

        for (String value : lista.values()) {
            System.out.println(value);
        }
    }

    /**
     * Chave nunca se repete
     * Garante que as chaves estarão em ordem ascendente.
     * pode ser retirado do mapa por chave
     */
    private static void exemploListaSimplesTM() {
        System.out.println("****** exemploListaSimples ******");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(4, "João da Silva");
        lista.put(3, "Lúcia Ferreira");

        System.out.println(lista);
        System.out.println("");
    }

    public static void exemploSalaAula(){
        System.out.println("***** exemploSalaAula *****");
        Map<Integer, List<Aluno>> listaSala = new HashMap<>();

        List<Aluno> alunosSala1 = criarTurma("Sala 1",10);
        listaSala.put(1, alunosSala1);

        List<Aluno> alunosSala2 = criarTurma("Sala 2",30);
        listaSala.put(2, alunosSala2);

        imprimirAlunosSala(listaSala.get(1));
    }
    private static List<Aluno> criarTurma(String sala, int count) {
        List<Aluno> alunos = new ArrayList<>();
        for (int i = 0; i< count; i++) {
            Aluno aluno = new Aluno("Nome aluno " + i, "Curso" + i, i, sala);
            alunos.add(aluno);
        }
        return alunos;
    }

    private static void imprimirAlunosSala(List<Aluno> alunos) {
        //for java 8 API stream
        System.out.println("for java 8 API stream");
        alunos.forEach(aluno->System.out.println("Nome: " + aluno.getNome() + " Sala: " + aluno.getSala()));
        System.out.println("");

        System.out.println("for java");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + " Sala: " + aluno.getSala());
        }
        System.out.println("");

        System.out.println("for java com contador");
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println("Nome: " + aluno.getNome() + " Sala: " + aluno.getSala());
        }
    }

}