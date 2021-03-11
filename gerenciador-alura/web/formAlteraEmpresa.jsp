<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/alteraEmpresa" var ="linkServletNovaEmpresa"/>
<html>
    <head>
        <title>Editar Empresa</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         
    </head>
    
    <body>
        
           
       
        <form action="${linkServletNovaEmpresa}" method="post">
            
            Nome: <input type="text" name="nome" value ="${empresa.nome }">
            
            <input type="hidden" name="id" value="${empresa.id}">
            <input type="submit"   />
            
        </form>
        
        
    </body>
</html>
