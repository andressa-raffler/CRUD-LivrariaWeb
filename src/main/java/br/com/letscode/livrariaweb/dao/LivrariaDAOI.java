package br.com.letscode.livrariaweb.dao;

import br.com.letscode.livrariaweb.model.Livro;
import java.util.List;
import java.util.Optional;

public interface LivrariaDAOI {
    Livro save(Livro livro);
    List<Livro> findAll();

    void delete(String idLivro);

    Optional<Livro> getById(String id);

    Optional<Livro> update(Livro livro);
}
