package br.com.letscode.livrariaweb.dao;

import br.com.letscode.livrariaweb.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivrariaDAO {
    private static List<Livro> LivrariaDAOList = new ArrayList<>();

    public List<Livro> getLivrariaDAOList() {
        return LivrariaDAOList;
    }

    public static Livro save(Livro livro){
        LivrariaDAOList.add(livro);
        return livro;
    }

}
