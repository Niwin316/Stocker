
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenedor Bodega</title>
    </head>
    <body>
        <h1>Consutar y Actualizar Bodegas</h1>
        
          <center>

        <div class="container">
            <form name="form" action="Controlador" method="POST">
                
                <input class="btn btn-success" type="submit" name="accion" value="Listar Bodegas"><br>
                Ingrese ID de Bodega:<input type="number" onclick="borrar_id();" name="txtBuscarBod">
                <input onclick="return validar();"  class="btn btn" type="submit" name="accion" value="Buscar Bodega">
                <label id="error" style="color:red"></label><br>
                
                <input  class="btn btn-success" type="submit" name="accion" value="Agregar Bodega"><br>
                
                
            </form>
        </div>
        <div class="container">
            <table border ="1">
                <thead>
                    <tr>
                        <th>ID Bodega</th>
                        <th>Nombre</th>
                        <th>Tienda</th>
                        <th>Direccion</th>
                        <th>Acciones</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dato" items="${datos}">
                        <tr>
                            <td>${dato.getIDBODEGA()}</td>
                            <td>${dato.getNOMBRE()}</td>
                            <td>${dato.getTIENDA()}</td>
                            <td>${dato.getDIRECCION()}</td>
                            <td>
                                <form action="Controlador" method="POST">
                                    <input type="hidden" name="id" value="${dato.getIDBODEGA()}">
                                    <input class="btn btn-warning" type="submit" name="accion" value="Editar Bodega">
                                    <input class="btn btn-danger" type="submit" name="accion" value="Eliminar Bodega">
                                </form>
                            </td>
                        </tr>
                    
                    </c:forEach>
            </tbody>
            </table>
            

     </center>   
    <script>
        function validar(){
            return validar_id();
        }
            function validar_id(){
                   var id=document.form.txtBuscarBod.value;
                   var error=document.getElementById("error");
                   if(id==0){
                       error.textContent="Ingrese ID";
                       return false;
                   }
                   else if(id<0){
                       error.textContent="No existen valores negativos";
                       return false;
                   }
                   else if(isNaN(id)){
                       error.textContent="Solo se permiten numeros";
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
        <a href="Menu.jsp"><input  type="button" value="Volver al menu"></a>
    </body>
</html>
