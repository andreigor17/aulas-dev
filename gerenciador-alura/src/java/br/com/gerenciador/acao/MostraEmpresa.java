package br.com.gerenciador.acao;

import br.com.foxinline.gerenciador.modelo.Banco;
import br.com.foxinline.gerenciador.modelo.Empresa;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class MostraEmpresa {
    
    
    public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
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
