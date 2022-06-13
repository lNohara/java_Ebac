package br.com.lnohara.mod23.tarefa;

import org.junit.Assert;
import org.junit.Test;

public class TestePessoa {

    @Test
    public void testeClassePessoa() {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Maria");
        Assert.assertEquals("Maria", pessoa.getNome());

        pessoa.setSexo("f");
        Assert.assertEquals("f", pessoa.getSexo());

        String pessoaToStrring = pessoa.toString();
        Assert.assertEquals("Pessoa{nome='Maria', sexo='f'}", pessoaToStrring);
    }
}
