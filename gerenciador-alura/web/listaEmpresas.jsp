

<%@page import="br.com.foxinline.gerenciador.servlet.Empresa"%>
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

        <div>Lista de Empresas</div>

        <ul>
            <c:forEach items="${empresas}" var="empresa">
                <li> ${empresa.nome} </li>
            </c:forEach>
        </ul>

    </body>
</html>
