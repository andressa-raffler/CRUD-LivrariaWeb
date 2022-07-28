package br.com.letscode.livrariaweb.bo;

import br.com.letscode.livrariaweb.model.Livro;
import java.util.List;
public interface LivrariaBusinessObjectI {

    Livro save(Livro livro);
    List<Livro> findAll();

    void delete(String idLivro);

    Livro getById(String id);

    Livro update(Livro livro);

}
