package br.com.foxinline.gerenciador.servlet;

import br.com.foxinline.gerenciador.modelo.Banco;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RemoveEmpresaServlet", urlPatterns = {"/removeEmpresa"})
public class RemoveEmpresaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);
        
        Banco banco = new Banco();
        banco.removeEmpresa(id);
        
        response.sendRedirect("listaEmpresas");
        
        
    }
}