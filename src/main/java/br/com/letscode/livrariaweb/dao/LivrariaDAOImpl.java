package br.com.letscode.livrariaweb.dao;

import br.com.letscode.livrariaweb.model.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LivrariaDAOImpl implements LivrariaDAOI {
    private static List<Livro> bancoLivros = new ArrayList<>();
    //private static long countLivro;

    public List<Livro> findAll() {
        return bancoLivros;
    }

    @Override
    public void delete(String idLivro) {
        bancoLivros.removeIf(livro -> livro.getId().equals(Long.valueOf(idLivro)));
    }

    @Override
    public Optional<Livro> update(Livro livroComDadosNovos) {
        for (Livro livroParaAlterar: bancoLivros) {
            if (livroParaAlterar.getId().equals(livroComDadosNovos.getId())){
                alteraLivro(livroParaAlterar, livroComDadosNovos);
                return Optional.of(livroParaAlterar);
            }
        }
        return Optional.empty();
    }

    private void alteraLivro(Livro livroParaAlterar, Livro livroComDadosNovos) {
        livroParaAlterar.setId(livroComDadosNovos.getId());
        livroParaAlterar.setNome(livroComDadosNovos.getNome());
        livroParaAlterar.setAutor(livroComDadosNovos.getAutor());
    }

    @Override
    public Optional<Livro> getById(String id) {
        for (Livro livroJaCadastrado : bancoLivros){
            if(livroJaCadastrado.getId().equals(Long.parseLong(id))){
                return Optional.of(livroJaCadastrado);
            }
        }
        return Optional.empty();
    }

    public Livro save(Livro livro){
        bancoLivros.add(livro);
        return livro;
    }

}
