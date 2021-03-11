package br.com.foxinline.gerenciador.servlet;

import br.com.foxinline.gerenciador.modelo.Banco;
import br.com.foxinline.gerenciador.modelo.Empresa;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ListaEmpresasServlet", urlPatterns = {"/listaEmpresas"})
public class ListaEmpresasServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();
         request.setAttribute("empresas", lista);
         
         RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
         rd.forward(request, response);



    }
}