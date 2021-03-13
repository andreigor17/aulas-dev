package br.com.foxinline.gerenciador.servlet;

import br.com.gerenciador.acao.Acao;
import br.com.gerenciador.acao.AlteraEmpresa;
import br.com.gerenciador.acao.ListaEmpresas;
import br.com.gerenciador.acao.MostraEmpresa;
import br.com.gerenciador.acao.NovaEmpresa;
import br.com.gerenciador.acao.NovaEmpresaForm;
import br.com.gerenciador.acao.RemoveEmpresa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
        String nomedaClasse = "br.com.gerenciador.acao." + paramAcao;
        
        String nome;
        try {
            Class classe = Class.forName(nomedaClasse); //carrega a classe com o nome
            Acao acao = (Acao) classe.newInstance();
            nome = acao.executa(request, response);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e){
          throw new ServletException(e); 
            
        }
        
        
        String[] tipoEndereco = nome.split(":");
        if(tipoEndereco[0].equals("forward")){
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEndereco[1]);
            rd.forward(request, response);
        } else {
            response.sendRedirect(tipoEndereco[1]);
        }
//        String nome = null;
//
//        if ((paramAcao.equals("ListaEmpresas"))) {
//            ListaEmpresas acao = new ListaEmpresas();
//            nome = acao.executa(request, response);
//        }
//
//        if ((paramAcao.equals("RemoveEmpresa"))) {
//            RemoveEmpresa acao = new RemoveEmpresa();
//            nome = acao.executa(request, response);
//        }
//
//        if ((paramAcao.equals("MostraEmpresa"))) {
//            MostraEmpresa acao = new MostraEmpresa();
//            nome = acao.executa(request, response);
//
//        }
//
//        if ((paramAcao.equals("AlteraEmpresa"))) {
//            AlteraEmpresa acao = new AlteraEmpresa();
//            nome = acao.executa(request, response);
//
//        }
//
//        if ((paramAcao.equals("NovaEmpresa"))) {
//            NovaEmpresa acao = new NovaEmpresa();
//            nome = acao.executa(request, response);
//
//        }
//        
//        if ((paramAcao.equals("NovaEmpresaForm"))) {
//            NovaEmpresaForm acao = new NovaEmpresaForm();
//            nome = acao.executa(request, response);
//
//        }
        
        
        
    }
}