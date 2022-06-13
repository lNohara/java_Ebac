package br.com.lnohara.mod18.aula02;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface PrimeraAnotacao {

    String value();

    String[] bairros();

    long numeroCasa();

    // quando tem valor default, não é obrigatório passar o valor na classe
    double noaObrigatorio() default 10d;
}
