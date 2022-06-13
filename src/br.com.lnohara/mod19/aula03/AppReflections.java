package br.com.lnohara.mod19.aula03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppReflections {

    public static void main(String[] args) {
        Class classe = Produto.class;
        System.out.println(classe);

        Produto prod = new Produto();
        Class prodClass = prod.getClass();
        System.out.println(prodClass);

        try {
            Constructor constructor = classe.getConstructor();
            Produto produto = (Produto) constructor.newInstance();
            System.out.println(constructor);
            System.out.println(produto);

            Field[] fields = produto.getClass().getDeclaredFields();
            for(Field field : fields){
                Class<?> type = field.getType();
                String nome = field.getName();
                System.out.println(type);
                System.out.println(nome);
            }

            Method[] Method = produto.getClass().getDeclaredMethods();
            for (Method m : Method) {
                Class<?> type = m.getReturnType();
                String nome = m.getName();
                System.out.println(type);
                System.out.println(nome);

                System.out.println("Executando métodos");
                if(m.getName().startsWith("get")){
                    System.out.println(m.invoke(prod));
                } else {
                    for (Class classesTypes : m.getParameterTypes()) {
                        if(classesTypes.equals(String.class)){
                            System.out.println(m.invoke(prod, "Rodrigo"));
                        } else if (classesTypes.equals(Long.class)){
                            System.out.println(m.invoke(prod, 1l));
                        } else {
                            System.out.println(m.invoke(prod, 3d));
                        }
                    }
                }
            }

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
