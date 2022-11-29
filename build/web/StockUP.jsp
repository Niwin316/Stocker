

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>   
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/alertify.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/default.min.css" rel="stylesheet" type="text/css"/>
        <script src="css/alertify.min.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Stock Actual</title>
    </head>
    <body>
    
        <h1>Actualizar Stock</h1>
          <center>
            <div>
                <form name="form" action="Controlador" method="POST" onsubmit="return stkMaxMin()">

                <input type="hidden" name="id" value="${producto.getIDPRODUCTO()}">
                <input type="text" name="id" value="${producto.getNOMBREPROD()}" disabled=""><br><br>
                Stock Maximo:
                <input type="text" name="txtStockMax" value="${producto.getSTOCK_MAX()}" disabled=""><br><br>
                
                Stock Minimo: 
                <input type="text" onclick="borrar_stock();" name="txtStockMin" value="${producto.getSTOCK_MIN()}" disabled=""><br><br>
                
                Stock Actual:
               
                <input type="number" onclick="borrar_stock();" name="txtStockActual" value="${producto.getSTOCK_ACTUAL()}">
                <label id="error" style="color:red"></label><br><br>
                
                <input onclick="return validar();" class="btn btn-success" type="submit" name="accion" value="Actualizar Stock"><br>
                
                
            </form>
            </div>
            </center>
<script>
        function validar(){
            return validar_stock();
            return false;
            }
                 
        }

            function validar_stock(){
                   var stock=document.form.txtStockActual.value;
                   var error=document.getElementById("error2");
                   if(stock==0){
                       error.textContent="Ingrese Stock Actual";
                       return false;
                   }
                   else if(stock<0){
                       error.textContent="No existen valores negativos";
                       return false;
                   }
                   else if(isNaN(stock)){
                       error.textContent="Solo se permiten numeros";
                       return false;
                   }else{
                       return true;
                   }

               }
 
               function borrar_stock(){
                   var borrar=document.getElementById("error2")
                   borrar2.textContent="";
               }

</script>
        
<script>
            function stkMaxMin(){
                
                stkMaximo=parseInt(document.form.txtStockMax.value);
                stkMinimo=parseInt(document.form.txtStockMin.value);
                stkActual=parseInt(document.form.txtStockActual.value);
                
               if(stkMaximo < stkActual){
               alertify.alert("STOCK MAXIMO SUPERADO","Para cambiar stock edite el producto").set('label','Ok');
                   return false;  
               }
                else if(stkMinimo > stkActual){
                   alertify.alert("STOCK MINIMO SUPERADO","Para cambiar stock edite el producto").set('label','Ok');
                   return false;
               }
                else{
                   alertify.success("Todo correcto")
                   return true;
               }
               
            }
          
            
</script>

           <a href="ConsultarProd.jsp"><input type="button" value="Atras"></a>
    </body>
</html>
