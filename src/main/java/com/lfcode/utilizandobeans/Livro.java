package com.lfcode.utilizandobeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {

    @Autowired
    AutorLivro autor;

    private String nome;
    private String codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public AutorLivro getAutor() {
        return autor;
    }

    public void setAutor(AutorLivro autor) {
        this.autor = autor;
    }

    public void exibir(){
        System.out.println("Nome do Livro: " + this.nome  + " - Codigo: " + this.codigo);
        autor.exibirAutor();
        System.out.println("----------------------------------------------------");
    }
}
