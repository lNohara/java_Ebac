package br.com.lnohara.mod21.aula04;

public class AnonimasTeste {
    public static void main(String[] args) {

        //Implementando interface anonima
        MyEventConsumer anonima = new MyEventConsumer() {
            @Override
            public void consumer(Object value) {
                System.out.println(value);
            }
        };
        anonima.consumer("Teste Anonima");

        // Com Lambda
        MyEventConsumer anonimaLambda = (Object value) -> System.out.println(value);
        anonimaLambda.consumer("Teste com Lambda");

        receberInterface((Object value) ->System.out.println(value));
    }

    private static void receberInterface(MyEventConsumer anonimaLambda){
        anonimaLambda.consumer("Método que recebe lambda expression como argumento");
    }
}
