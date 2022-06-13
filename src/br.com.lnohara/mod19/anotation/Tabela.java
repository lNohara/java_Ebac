package br.com.lnohara.mod19.anotation;

import java.lang.reflect.Field;

public class Tabela {

    private int id;

    @NomeDaTabela("getNome")
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void checaAnnotation(Tabela tabela){
        Field[] fields = tabela.getClass().getDeclaredFields();
        for(Field field : fields) {
            String name = field.getName();
            if (field.isAnnotationPresent(NomeDaTabela.class)) {
                NomeDaTabela nome = field.getAnnotation(NomeDaTabela.class);
                System.out.println("O atributo: " + name + " - tem annotation - " + getNome());
            }
            else {
                System.out.println("O atributo: " + name + " - não possui annotation");
            }
        }
    }
}

