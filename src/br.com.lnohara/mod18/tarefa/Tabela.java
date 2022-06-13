package br.com.lnohara.mod18.tarefa;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface Tabela {
    String value();
}
