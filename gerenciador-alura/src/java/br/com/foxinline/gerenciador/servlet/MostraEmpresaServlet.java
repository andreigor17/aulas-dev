package br.com.foxinline.gerenciador.servlet;

import br.com.foxinline.gerenciador.modelo.Banco;
import br.com.foxinline.gerenciador.modelo.Empresa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MostraEmpresaServlet", urlPatterns = {"/mostraEmpresa"})
public class MostraEmpresaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);
        
        Banco banco = new Banco();
        Empresa empresa = banco.buscaEmpresaPeloId(id);
        System.out.println(empresa.getNome());
        
        request.setAttribute("empresa", empresa);
        RequestDispatcher rd = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
        rd.forward(request, response);
        
        

    }
}