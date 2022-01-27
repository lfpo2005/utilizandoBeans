package com.lfcode.utilizandobeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Autor autor = factory.getBean(Autor.class);
        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Biblia Sagrada");
        livro.setCodigo("cod_001");
        autor.setAutor("Divinamente Espirado po Deus");
        livro.exibir();

        Autor autor1 = factory.getBean(Autor.class);
        Livro livro1 = factory.getBean(Livro.class);
        livro1.setNome("Novo Testatmento");
        livro1.setCodigo("cod_002");
        autor1.setAutor("Variados");
        livro.exibir();

        ((AbstractApplicationContext) factory).close();

    }
}
