package br.com.foxinline.gerenciador.servlet;

import br.com.foxinline.gerenciador.modelo.Banco;
import br.com.foxinline.gerenciador.modelo.Empresa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "AlteraEmpresaServlet", urlPatterns = {"/alteraEmpresa"})
public class AlteraEmpresaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String nomeEmpresa = request.getParameter("nome");
        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);
    
    
        Banco banco = new Banco();
        Empresa empresa = banco.buscaEmpresaPeloId(id);
        empresa.setNome(nomeEmpresa);
        
        response.sendRedirect("listaEmpresas");
        
    
    
    
    
    }
}
