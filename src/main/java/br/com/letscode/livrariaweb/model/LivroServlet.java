package br.com.letscode.livrariaweb.model;

import br.com.letscode.livrariaweb.bo.LivrariaBussinessObject;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/LivrariaWeb")
public class LivroServlet extends HttpServlet {
    LivrariaBussinessObject livrariaBussinessObject;

    public LivroServlet(LivrariaBussinessObject livrariaBussinessObject) {
        this.livrariaBussinessObject = livrariaBussinessObject;
    }

    @Override
    public void init(){
        System.out.println("Iniciando Livraria Servlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String autor = request.getParameter("autor");
        Livro livro = new Livro(nome, autor);
        Livro livroSalvo = livrariaBussinessObject.save(livro);
        List<Livro> livros = livrariaBussinessObject.findAll();

        request.setAttribute("livros", livros);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listar-livros.jsp");
        dispatcher.forward(request,response);
    }
}
