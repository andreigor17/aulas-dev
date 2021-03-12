package br.com.gerenciador.acao;

import br.com.foxinline.gerenciador.modelo.Banco;
import br.com.foxinline.gerenciador.modelo.Empresa;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovaEmpresa {

    public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String nomeEmpresa = request.getParameter("nome");
        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);

        Banco banco = new Banco();
        banco.adiciona(empresa);

        response.sendRedirect("entrada?acao=ListaEmpresas");

    }
}
