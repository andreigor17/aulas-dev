<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var ="linkEntradaServlet"/>
<html>
    <head>
        <title>Cadastro de Empresa</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         
    </head>
    
    <body>
        
           
       
        <form action="${linkEntradaServlet}" method="post">
            
            Nome: <input type="text" name="nome" placeholder="Insira o nome da empresa: "  />
            
            <input type="submit"   />
            <input type="hidden" name="acao" value="NovaEmpresa"/>
            
        </form>
        
        
    </body>
</html>
