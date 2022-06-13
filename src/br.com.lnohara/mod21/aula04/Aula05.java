package br.com.lnohara.mod21.aula04;

public class Aula05 {
    public static void main(String[] args) {
        MyEventConsumer myEvent = (Object s) -> {
            System.out.println(s);
        };

        MyEventConsumer myEvent1= (s) -> {
            System.out.println(s);
        };

        MyEventConsumer myEvent2 = s ->  System.out.println(s);

        // Obrigatoriamente preciso de chaves quando minha expressão
        // lambda tiver mais de uma instrução
        MyEventConsumer myEvent3 = s ->  {
            System.out.println(s);
            System.out.println(s);
        };

        // Referência de métodos
        MyEventConsumer referenciaDeMetodo = System.out::println;
        referenciaDeMetodo.consumer("Referencia de método");

        //Referência de Método estático
        Finder finder = MyClass::doFind;
        int result = finder.find("Teste", "Teste");
        System.out.println(result);

        //Referência de método no parâmetro
        Finder finderParam = String::indexOf;
        int resultParam = finderParam.find("Teste", "Teste");
        System.out.println(resultParam);
        //Mesma coisa que de cima só que com lambda
        Finder finderParamSame = (s1, s2) -> s1.indexOf(s2);
        int resultadoParamLambda = finderParamSame.find("Teste", "Teste");
        System.out.println(resultadoParamLambda);

    }
}
