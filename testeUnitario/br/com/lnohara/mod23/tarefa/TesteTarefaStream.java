package br.com.lnohara.mod23.tarefa;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
public class TesteTarefaStream {

    @Test
    public void testeTarefaStream() {

        TarefaStream testeTarefaStream = new TarefaStream();

        // lista de mulheres para comparação
        List<Pessoa> mulheres = new ArrayList<Pessoa>();
        mulheres.add(new Pessoa("Ana", "f"));
        mulheres.add(new Pessoa("Raquel", "f"));
        mulheres.add(new Pessoa("Gabriela", "f"));

        // lista de pessoas para serem filtradas
        List<Pessoa> pessoas = new ArrayList<Pessoa>();;
        pessoas.add(new Pessoa("Manuel", "m"));
        pessoas.addAll(mulheres);
        pessoas.add(new Pessoa("Jonas", "m"));

        // valida se a lista de cadastrados é igual a lista de pessoas
        String exibeCadastrados = testeTarefaStream.exibeCadastrados(pessoas);
        Assert.assertEquals(pessoas.toString(), exibeCadastrados);

        // valida se o metodo exibeMulheresCollect irá retornar só as mulheres ao filtar a lista de pessoas
        List<Pessoa> exibeMulheresCollect = testeTarefaStream.exibeMulheresCollect(pessoas);
        Assert.assertEquals(mulheres, exibeMulheresCollect);
        Assert.assertNotEquals(pessoas, exibeMulheresCollect);

        // valida a quantidade de mulheres
        int contantoAsMulheres = testeTarefaStream.contantoAsMulheres(pessoas);
        Assert.assertEquals(3, contantoAsMulheres);
        Assert.assertNotEquals(2, contantoAsMulheres);
        Assert.assertNotEquals(4, contantoAsMulheres);
    }
}
