package br.com.lnohara.mod20;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Aula03 {
    public static void main(String[] args) {

        // Expressão lambda ->
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };
        int resultLambda = intBinaryOperator.applyAsInt(1,1);
        System.out.println("Com expressão lambda: " + resultLambda);

        // Em programação normal (sem lambda)
        IntBinaryOperator ope = new IntBinaryOperatorClass();
        int result = ope.applyAsInt(1, 1);
        System.out.println("Em programação normal: " + result);

        //BiFunction com lambda
        BiFunction<Integer, Integer, Integer> biFunction = (Integer a, Integer b) -> {
            return a + b;
        };
        Integer resultBi = biFunction.apply(10, 10);
        System.out.println(resultBi);

        // Recebe dois doubles e retornar uma String
        BiFunction<Double, Double, String> biFunctionDDS = (Double a, Double b) -> {
            Double re = a+b;
            return String.valueOf(re);
        };
        String resultDDS = "String " +  biFunctionDDS.apply(10d, 10d);
        System.out.println(resultDDS);

        // recebendo BiFunction como argumento
        Long returnLong = calcular(1L, 2L, (Long v1, Long v2) -> {
            return v1 + v2;
        });
        System.out.println(returnLong);
    }

    private static Long calcular(Long t, Long u, BiFunction<Long, Long, Long> function){
        return function.apply(t,u);
    }
}
