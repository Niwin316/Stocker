

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenedor Proveedores</title>
    </head>
    <body>
        <h1>Consultar y actualizar Proveedores</h1>
    <center>

        <div class="container">
            <form name="form" action="Controlador" method="POST">
                
                <input class="btn btn-success" type="submit" name="accion" value="Listar Proveedores"><br>
                Ingrese ID de Proveedor<input type="number" onclick="borrar_id();" name="txtBuscarProve">
                <input onclick="return validar();" class="btn btn" type="submit" name="accion" value="Buscar Proveedor">
                 <label id="error" style="color:red"></label><br>
                 <input class="btn btn-success" type="submit" name="accion" value="Agregar Proveedor"><br>
                
            </form>
        </div>
        <div class="container">
            <table border ="1">
                <thead>
                    <tr>
                        <th>ID Proveedor</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Direccion</th>
                        <th>Telefono</th>
                        <th>Email</th>
                        <th>ID Producto</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dato" items="${datos}">
                        <tr>
                            <td>${dato.getIDPROVEEDOR()}</td>
                            <td>${dato.getNOMBRE()}</td>
                            <td>${dato.getAPELLIDO()}</td>
                            <td>${dato.getDIRECCION()}</td>
                            <td>${dato.getTELEFONO()}</td>
                            <td>${dato.getEMAIL()}</td>
                            <td>${dato.getIDPRODUCTO()}</td>
                            <td>
                                <form action="Controlador" method="POST">
                                    <input type="hidden" name="id" value="${dato.getIDPROVEEDOR()}">
                                    <input class="btn btn-warning" type="submit" name="accion" value="Editar Proveedor">
                                    <input class="btn btn-danger" type="submit" name="accion" value="Eliminar Proveedor">
                                </form>
                            </td>
                        </tr>
                    
                    </c:forEach>
            </tbody>
            </table>
        </div>         
                
<script>
        function validar(){
            return validar_id();
        }
            function validar_id(){
                   var id=document.form.txtBuscarProve.value;
                   var error=document.getElementById("error");
                   if(id==0){
                       error.textContent=" Ingrese ID";
                       return false;
                   }
                   else if(id<0){
                       error.textContent=" No existen valores negativos";
                       return false;
                   }
                   else if(isNaN(id)){
                       error.textContent=" Solo se permiten numeros";
                       return false;
                   }else{
                       return true;
                   }

               }
               function borrar_id(){
                   var borrar=document.getElementById("error")
                   borrar.textContent="";
               }
        </script>
          

     </center>   
        <a href="Menu.jsp"><input type="button" value="Volver al menu"></a>
    </body>
</html>
