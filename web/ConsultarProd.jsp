

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenedor de Producto</title>
    </head>
    <body>
        <h1>Consultar y actualizar Producto</h1>
    <center>

        <div class="container buscar" >
            <form name="form" action="Controlador" method="POST">
                
                <input class="btn btn-success" type="submit" name="accion" value="Listar Productos"><br>
                
                Ingrese ID de Producto<input type="number" onclick="borrar_id();" name="txtBuscar">
                <input onclick="return validar();" class="btn btn" type="submit" name="accion" value="Buscar Producto">
                <label id="error" style="color:red"></label><br>
                
                <input class="btn btn-success" type="submit" name="accion" value="Agregar Producto"><br>
            </form>
        </div>
        <div class="container">
            <table class="table-bordered">
                <thead>
                    <tr>
                        <th>ID Producto</th>
                        <th>Nombre Producto</th>
                        <th>Valor Neto</th>
                        <th>Valor Venta</th>
                        <th>Descripcion</th>
                        <th>Stock Maximo</th>
                        <th>Stock Minimo</th>
                        <th>Stock Actual</th>
                        <th>ID Bodega</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dato" items="${datos}">
                        <tr>
                            <td>${dato.getIDPRODUCTO()}</td>
                            <td>${dato.getNOMBREPROD()}</td>
                            <td>${dato.getVALOR_NETO()}</td>
                            <td>${dato.getVALOR_VENTA()}</td>
                            <td>${dato.getDESCRIPCION()}</td>
                            <td>${dato.getSTOCK_MAX()}</td>
                            <td>${dato.getSTOCK_MIN()}</td>
                            <td>${dato.getSTOCK_ACTUAL()}</td>
                            <td>${dato.getIDBODEGA()}</td>
                            <td>
                                <form action="Controlador" method="POST">
                                    <input type="hidden" name="id" value="${dato.getIDPRODUCTO()}">
                                    <input class="btn btn-info" type="submit" name="accion" value="Editar Stock">
                                    <input class="btn btn-warning" type="submit" name="accion" value="Editar Producto">
                                    <input class="btn btn-danger" type="submit" name="accion" value="Eliminar Producto">
                                     
                                </form>
                            </td>
                        </tr>
                    
                    </c:forEach>
            </tbody>
            </table>
            
           
        </div>

     </center>   
     <script>
        function validar(){
            
            return validar_id();
            
        }
            function validar_id(){
                   var id=document.form.txtBuscar.value;
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
        
        <a href="Menu.jsp"><input type="button" value="Volver al menu"></a>
    
    </body>
</html>
