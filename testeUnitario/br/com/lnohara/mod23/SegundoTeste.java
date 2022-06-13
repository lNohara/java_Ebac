package br.com.lnohara.mod23;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SegundoTeste {
    @Test
    public void test2(){
        String nome = "Rodrigo";
        Assert.assertEquals("Rodrigo", nome);
    }
}