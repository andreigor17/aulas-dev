
<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
String nomeEmpresa = "FoxInLine";
System.out.println(nomeEmpresa);
%>

<html>
    <body>
      
   Empresa <% out.println(nomeEmpresa); %> cadastrada com sucesso!     
        
        
    </body>
</html>
