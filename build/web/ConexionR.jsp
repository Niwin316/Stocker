
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conexion</title>
    </head>
    <body>
        <h1>Conexion Reportes</h1>
                <%
            Connection con = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/Prototipo","root","" );
                out.print("Conexion en Linea");
            }catch (Exception ex){
                out.print("Error "+ ex.getMessage());
            }


        %>
    </body>
</html>
