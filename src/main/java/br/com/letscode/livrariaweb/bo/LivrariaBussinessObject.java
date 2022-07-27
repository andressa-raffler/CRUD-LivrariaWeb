package br.com.letscode.livrariaweb.bo;

import br.com.letscode.livrariaweb.dao.LivrariaDAO;
import br.com.letscode.livrariaweb.model.Livro;

import java.util.List;
import java.util.Objects;

public class LivrariaBussinessObject {
        LivrariaBussinessObject businessObject;

    public LivrariaBussinessObject(LivrariaBussinessObject livrariaDAO) {
        this.businessObject = livrariaDAO;
    }

    //findall
    public Livro save(Livro livro){
        valida(livro);
        return LivrariaDAO.save(livro);  //Metodo de persistencia?
    }

    public List<Livro> findAll(){
        return businessObject.findAll();
    }

    private void valida(Livro livro) {
        if(Objects.isNull(livro.getNome())){
            throw new IllegalArgumentException("Nome inválido");
        }
    }
}
