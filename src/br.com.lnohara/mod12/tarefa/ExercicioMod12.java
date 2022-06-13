package br.com.lnohara.mod12.tarefa;

import java.util.*;

public class ExercicioMod12 {
    public static void main(String[] args) {
        tarefa1();
        atividade2();
    }

    /**
     * @author Renata
     * Recebe os nomes de pessoas separados por vírgula
     * faz a ordenação e imprime no console
     * @return os nomes recebidos ordenados alfabeticamente
     */
    public static void tarefa1(){
        System.out.println("***** Informe os nomes separados por virgula (,) *****");

        Scanner s = new Scanner(System.in);
        System.out.print("Nomes: ");

        String nomes = s.next();
        String[] vtNomes = nomes.split(",");

        System.out.println("Nomes na ordem em que foram inseridos:");
        System.out.println(Arrays.toString(vtNomes));
        System.out.println("");

        System.out.println("Nomes em ordem alfabética crescente:");
        Arrays.sort(vtNomes);
        System.out.println(Arrays.toString(vtNomes));
        System.out.println("");

        System.out.println("Nomes em ordem alfabética decrescente:");
        Arrays.sort(vtNomes, Collections.reverseOrder());
        System.out.println(Arrays.toString(vtNomes));
        System.out.println("");
    }

    /**
     * Recebe <nomePessoa>-<genero>,<nomePessoa>-<genero>....
     * Cria um array com nomePessoa-genero
     * Cria um mapa com nomePessoa(key), genero(value)
     * Separa em dois novos mapas com base no valor do genero
     */
    public static void atividade2() {
        System.out.println("Exemplo: maria-f,julio-m");

        Scanner s = new Scanner(System.in);
        System.out.print("Nomes: ");
        String pessoa = s.next();

        Map<String, String> hashMap = new HashMap<String, String>();

        //separando as pessoas
        String parts[] = pessoa.split(",");
        //criando um mapa key=nome, value=genero
        for (String part : parts) {
            String pessoas[] = part.split("-");
            String nome = pessoas[0].trim();
            String genero = pessoas[1].trim();
            hashMap.put(nome, genero);
        }

        Map<String, String> mulheres = new LinkedHashMap<>();
        Map<String, String> homens = new LinkedHashMap<>();
        for (Map.Entry<String, String> employee : hashMap.entrySet()) {
            if(employee.getValue().equalsIgnoreCase("f")){
                mulheres.put(employee.getKey(), employee.getValue());
            } else{
                homens.put(employee.getKey(), employee.getValue());
            }
        }
        System.out.println("----------------------------------");

        System.out.println("Mulheres: ");
        mulheres.entrySet().forEach(e -> {
            System.out.println(e.getKey());
        });
        System.out.println("----------------------------------");

        System.out.println("Homens: ");
        homens.entrySet().forEach(e -> {
            System.out.println(e.getKey());
        });
        System.out.println("----------------------------------");
    }
}