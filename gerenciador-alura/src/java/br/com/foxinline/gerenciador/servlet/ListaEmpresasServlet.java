package br.com.foxinline.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ListaEmpresasServlet", urlPatterns = {"/listaEmpresas"})
public class ListaEmpresasServlet extends HttpServlet {
    
   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();
        
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<div>Lista de Empresas</div>");
        
        out.println("<ul>");
        
        for(Empresa empresa : lista){
            out.println("<li>" +  empresa.getNome() + "</li>");
        }
        
        out.print("</ul>");
        out.println("</body></html>");
   
    }

   
   
}
