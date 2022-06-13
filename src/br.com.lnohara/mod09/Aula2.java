package br.com.lnohara.mod09;

public class Aula2 {

    /************ Boxing ou autoboxing ************/

   /* Peguei um valor primitivo e joguei em uma variável
    do tipo Wrapper*/
    Boolean status = true;
    Boolean status1 = Boolean.TRUE;

    Character c = 'A';

    /*Pegar um valor e instanciar (não é autoboxing)*/
    Long cpf = Long.valueOf(1315484879);
    /*autoboxing, estou colocando um número primitivo dentro do Long*/
    Long rg = 1233123L;

    /************ unboxing ************/

    /*Estou convertendo um valor wrapper para primitivo*/
    boolean status2 = Boolean.TRUE;

    char letra = Character.valueOf('A');
 }
