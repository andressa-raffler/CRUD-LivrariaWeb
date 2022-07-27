package br.com.letscode.livrariaweb.model;

public class Livro {

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

    private String nome;
    private String autor;

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

}
