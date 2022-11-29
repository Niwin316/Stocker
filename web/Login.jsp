
<%@page import="DAO.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="styles.css">
        <title>Login</title>
    </head>
    
    <body>
                <%
            String idUsuario = request.getParameter("idUsuario");
            String clave = request.getParameter("clave");
            Usuario user = new Usuario();
            if (user.loguin(idUsuario, clave)) {
                session.setAttribute ("user", user);
                
                if (user.getTipo() == 1) {
                    response.sendRedirect("Menu.jsp");
                } else {
                    response.sendRedirect("Index.jsp");
                }
            } else {
                session.setAttribute("mensaje", "Error al loguear");
                response.sendRedirect("Index.jsp");
            }
        %>
        
      
        
    </body>
   
        
</html>
