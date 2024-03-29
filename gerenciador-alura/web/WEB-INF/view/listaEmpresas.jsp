

<%@page import="br.com.foxinline.gerenciador.modelo.Empresa"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Empresas</title>
    </head>
    <body>

        <c:if test="${not empty empresa}" >
            Empresa ${ empresa } cadastrada com sucesso!  
        </c:if>


        <div>Lista de Empresas</div>

        <ul>
            <c:forEach items="${empresas}" var="empresa">
                <li> ${empresa.nome} 
                    <a href="/gerenciador-alura/entrada?acao=MostraEmpresa&id=${empresa.id}">editar</a>
                    <a href="/gerenciador-alura/entrada?acao=RemoveEmpresa&id=${empresa.id}">remover</a>

                </li>
            </c:forEach>
        </ul>

    </body>
</html>
