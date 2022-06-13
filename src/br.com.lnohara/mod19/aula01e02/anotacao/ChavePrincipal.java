package br.com.lnohara.mod19.aula01e02.anotacao;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface ChavePrincipal {

    String value();
}
