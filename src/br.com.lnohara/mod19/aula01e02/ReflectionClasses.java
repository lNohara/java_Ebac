package br.com.lnohara.mod19.aula01e02;

import br.com.lnohara.mod19.aula01e02.anotacao.ChavePrincipal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionClasses {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        executeClasses();

        separador();
        executeConstructors();

        separador();
        executeFields();

        separador();
        executeMethods();

        separador();
        executePackegeInfo();

        separador();
        executeSuperClass();

        separador();
        executeInterface();

        separador();
        executeleituraAnotacao();
    }

    private static void separador(){
        System.out.println("________________________________________");
        System.out.println("________________________________________");
    }

    private static void executeClasses() throws ClassNotFoundException {
        System.out.println("**** Classes ****");

        Class c1 = boolean.class;
        System.out.println(c1);


        Class c2 = java.io.PrintStream.class;
        System.out.println(c2);

        Class c3 = Class.forName("br.com.lnohara.mod19.aula01e02.ReflectionClasses");
        System.out.println(c3);

        separador();

        System.out.println(ReflectionClasses.class);
        System.out.println(ReflectionClasses.class.getSimpleName());
        System.out.println(ReflectionClasses.class.getName());
    }

    private static void executeConstructors() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("**** Construtores ****");
        Class prodC = ProdutoReflection.class;
        System.out.println(prodC);
        separador();

        Constructor con = prodC.getConstructor();
        System.out.println(con);
        separador();

        ProdutoReflection prd = (ProdutoReflection) con.newInstance();
        System.out.println(prd);
        separador();

        Constructor con1 = prodC.getConstructor(Long.class);
        System.out.println(con1);
        ProdutoReflection prod1 = (ProdutoReflection) con1.newInstance(10L);
        System.out.println(prod1 + "Tem o valor: " + prod1.getCodigo());
        separador();

        Constructor[] constructors = prodC.getConstructors();
        System.out.println("Construtores declarados");
        for(Constructor cons : constructors){
            System.out.println(cons);
        }
    }

    private static void executeFields(){
        System.out.println("**** Propriedades ***");
        ProdutoReflection prod = new ProdutoReflection();
        Field [] fields = prod.getClass().getDeclaredFields();
        for(Field field : fields) {
            System.out.println("Nome Completo: " + field);
            System.out.println("Nome simples : " + field.getName());
            System.out.println("Tipo da proriedade: " + field.getType());
            System.out.println();
        }
    }

    private static void executeMethods() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        System.out.println("*** Métodos ***");

        ProdutoReflection prod = new ProdutoReflection();
        Method[] methods = prod.getClass().getDeclaredMethods();

        for (Method m : methods){
            System.out.println("Nome completo: " + m);
            System.out.println("Nome Simples: " + m.getName());
            System.out.println("Tipo de Retorno: " + m.getReturnType());
            System.out.println();
        }

        Method method = prod.getClass().getMethod("getNome");
        System.out.println("Pegando método pelo nome: " + method.getName());

        Method method1 = prod.getClass().getMethod("setNome", String.class);
        System.out.println("Pegando método pelo nome: " + method1.getName());
    }

    private static void executePackegeInfo() {
        System.out.println("*** Info packages");
        ProdutoReflection prod = new ProdutoReflection();
        System.out.println("Nomme completo: " + prod.getClass().getPackage());
        System.out.println("Nome: " + prod.getClass().getPackage().getName());
    }

    private static void executeSuperClass() {
        System.out.println("Super Classe");
        ProdutoReflection prod = new ProdutoReflection();
        System.out.println("Nome super class: " + prod.getClass().getSuperclass().getName());

    }

    private static void executeInterface(){
        System.out.println("*** Interface ***");
        ProdutoReflection prod = new ProdutoReflection();
        Class<?> [] interfaces = prod.getClass().getInterfaces();
        for(Class cl : interfaces){
            System.out.println("Nome interface: " + cl.getName());
            System.out.println("Nome interface: " + cl.getSimpleName());
        }
    }

    private static void executeleituraAnotacao(){
        System.out.println("*** Annotations ***");
        ProdutoReflection prod = new ProdutoReflection();
        Annotation [] annotations = prod.getClass().getAnnotations();
        for(Annotation an : annotations){
            System.out.println("Annotation type: " + an.annotationType());
        }

        for (Field field : prod.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(ChavePrincipal.class)){
                ChavePrincipal ano = field.getAnnotation(ChavePrincipal.class);
                System.out.println("Nome da Anotação: " + ano.toString());
                System.out.println("Valor da Anotação: " + ano.value());
            }
        }

        if(prod.getClass().isAnnotationPresent(ChavePrincipal.class)) {
            ChavePrincipal ano = prod.getClass().getAnnotation(ChavePrincipal.class);
            System.out.println("Nome da Anotação: " + ano.getClass().getName());
            System.out.println("Valor da Anotação: " + ano.value());
        }
    }
}
