package com.lfcode.utilizandobeans;

public class Autor implements AutorLivro{

    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void exibirAutor() {
        System.out.println("Autor: " + this.autor);
    }

}
