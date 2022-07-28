package br.com.letscode.livrariaweb.model;

import lombok.Data;

import java.util.Objects;

@Data
public class Livro {

    private Long id;
    private String nome;
    private String autor;

    public Livro(String id, String nome, String autor) {
        this.id = Long.parseLong(id);
        this.nome = nome;
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(id, livro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, autor);
    }
}
