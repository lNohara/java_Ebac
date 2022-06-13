package br.com.lnohara.mod15.aula02;

public class DemoSingleton {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getIntance();
        System.out.println(singleton);

        Singleton singleton1 = Singleton.getIntance();
        System.out.println(singleton1);
        //Note que a referencia de memória é a mesma para singleton e singleton1
        // Significa que ambos são o mesmo objeto

        // não é efetivo quando vc trabalha com threds
    }
}
