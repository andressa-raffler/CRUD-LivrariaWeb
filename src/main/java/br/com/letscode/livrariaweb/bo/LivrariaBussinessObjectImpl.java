package br.com.letscode.livrariaweb.bo;


import br.com.letscode.livrariaweb.dao.LivrariaDAOI;
import br.com.letscode.livrariaweb.model.Livro;
import javax.inject.Inject;
import java.util.List;
import java.util.Objects;


public class LivrariaBussinessObjectImpl implements LivrariaBusinessObjectI {

    private LivrariaDAOI livrariaDAO;


@Inject
    public LivrariaBussinessObjectImpl(LivrariaDAOI livrariaDAO) {
        this.livrariaDAO = livrariaDAO;
    }

    //findall
    public Livro save(Livro livro){
        valida(livro);
        return livrariaDAO.save(livro);  //Metodo de persistencia?
    }

    public List<Livro> findAll(){
        return livrariaDAO.findAll();
    }

    @Override
    public void delete(String idLivro) {
    livrariaDAO.delete(idLivro);
    }

    @Override
    public Livro getById(String id) {
       return livrariaDAO.getById(id).get();
    }

    @Override
    public Livro update(Livro livro) {
        return livrariaDAO.update(livro).get();
    }

    private void valida(Livro livro) {
        if(Objects.isNull(livro.getNome())){
            throw new IllegalArgumentException("Nome inválido");
        }
    }
}
