<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var ="linkServletNovaEmpresa"/>
<html>
    <head>
        <title>Cadastro de Empresa</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         
    </head>
    
    <body>
        
           
       
        <form action="${linkServletNovaEmpresa}" method="post">
            
            Nome: <input type="text" name="nome" placeholder="Insira o nome da empresa: "  />
            
            <input type="submit"   />
            
        </form>
        
        
    </body>
</html>
