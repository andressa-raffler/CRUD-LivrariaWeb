package br.com.letscode.livrariaweb.model;

import br.com.letscode.livrariaweb.bo.LivrariaBusinessObjectI;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(value = "/livro-servlet")
public class LivroServlet extends HttpServlet {

    LivrariaBusinessObjectI livrariaBussinessObjectI;
    

    @Inject
    public LivroServlet(LivrariaBusinessObjectI livrariaBusinessObjectI) {
        this.livrariaBussinessObjectI = livrariaBusinessObjectI;
    }

    @Override
    public void init(){
        System.out.println("Iniciando Livraria Servlet");

    }


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Iniciando o metodo service");
        criarNovoLivro(request);

        String caminho = request.getPathInfo();

        switch (caminho) {
            case "/cadastrar-livros": //C
                doPost(request, response);
                break;
            case "/listar-livros": //R
                doGet(request, response);
                break;
            case "/editar-livro": //U
                doPut(request, response);
                break;
            case "/deletar-livro": //D
                doDelete(request, response);
                break;
            default:
                service(request, response);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Iniciando o metodo post");
        Livro livro = criarNovoLivro(request);
        livrariaBussinessObjectI.save(livro);
        List<Livro> livros = livrariaBussinessObjectI.findAll();
        request.setAttribute("livros", livros);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/listar-livros.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Iniciando o metodo put");

        String id = request.getParameter("id");
        Livro livro = criarNovoLivro(request);
        livro.setId(Long.parseLong(id));
        Livro livroAlterado = livrariaBussinessObjectI.update(livro);

        request.setAttribute("idLivroAlterado", livroAlterado.getId());
        List<Livro> livros = livrariaBussinessObjectI.findAll();
        request.setAttribute("livros", livros);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/listar-livros.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        livrariaBussinessObjectI.delete(id);
    }

    @Override
    public void destroy() {
        System.out.println("Destruindo Servlet");
    }
    private Livro criarNovoLivro(HttpServletRequest request) {
        String id = request.getParameter("id");
        String nome = request.getParameter("nome");
        String autor = request.getParameter("autor");
        return new Livro(id, nome, autor);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idLivro = request.getParameter("id");
        Livro livro = livrariaBussinessObjectI.getById(idLivro);
        request.setAttribute("livro", livro);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/listar-livros.jsp");
        dispatcher.forward(request,response);
    }
}
