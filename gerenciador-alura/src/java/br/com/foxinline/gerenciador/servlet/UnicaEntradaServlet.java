package br.com.foxinline.gerenciador.servlet;

import br.com.gerenciador.acao.ListaEmpresas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UnicaEntradaServlet", urlPatterns = {"/entrada"})
public class UnicaEntradaServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String paramAcao = request.getParameter("acao");

        if ((paramAcao.equals("ListaEmpresas"))) {
            
            ListaEmpresas acao = new ListaEmpresas();
            acao.executa(request, response);
        } 

        if ((paramAcao.equals("RemoveEmpresa"))) {
            System.out.println("Removendo empresas!");
        }

        if ((paramAcao.equals("MostraEmpresa"))) {
            System.out.println("Mostrando empresas!");
        }



    }
}