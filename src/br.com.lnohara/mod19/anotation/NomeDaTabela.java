package br.com.lnohara.mod19.anotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME) // agora pega em tempo de execução
@Target(ElementType.FIELD)
public @interface NomeDaTabela {
    String value();
}
