package br.com.lnohara.mod11.tarefa;

import java.util.Objects;

public class Pessoa {

    private String name;
    private String sexo;

    public Pessoa(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(name, pessoa.name) && Objects.equals(sexo, pessoa.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sexo);
    }

    @Override
    public String toString() {
        return name;
    }
}
