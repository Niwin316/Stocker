

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
         
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Producto</title>
    </head>
    <body>
        <h1>Ingresar Producto</h1>
    <center>
        <div>
            <form name="form" action="Controlador" method="POST">
                ID Producto: <br>
                <input type="number" onclick="borrar_id();" name="txtIdProducto">
                <label id="error" style="color:red"></label><br>
                Nombre Producto: <br>
                <input type="text" onclick="borrar_nombre();" name="txtNombreProd">
                <label id="error1" style="color:red"></label><br>
                Valor Neto: <br>
                <input type="number" onclick="borrar_valorneto();" name="txtValorNeto">
                <label id="error2" style="color:red"></label><br>
                Valor Venta: <br>
                <input type="number" onclick="borrar_valorventa();" name="txtValorVenta">
                <label id="error3" style="color:red"></label><br>
                Descripcion: <br>
                <input type="text" onclick="borrar_descripcion();" name="txtDescripcion">
                <label id="error4" style="color:red"></label><br>
                Stock Maximo: <br>
                <input type="number" onclick="borrar_stockmax();" name="txtStockMax">
                <label id="error5" style="color:red"></label><br>
                Stock Minimo: <br>
                <input type="number" onclick="borrar_stockmin();" name="txtStockMin">
                <label id="error6" style="color:red"></label><br>
                Stock Actual: <br>
                <input type="number" onclick="borrar_stockactual();" name="txtStockActual">
                <label id="error7" style="color:red"></label><br>
                ID Bodega: <br>
                <input type="number" onclick="borrar_idbodega" name="txtIdBodega">
                <label id="error8" style="color:red"></label><br>

                <input onclick="return validar();" type="submit" name="accion" value="Guardar Producto"><br>
            </form>
        </div>
        <script>
                  function validar(){
                  if(!validar_id() || !validar_nombre() || !validar_valorneto() || !validar_valorventa() || !validar_descripcion() || !validar_stockmax() || !validar_stockmin() || !validar_stockactual() || !validar_idbodega()){ 
                      return validar_id();
                      return validar_nombre(); 
                      return validar_valorneto();
                      return validar_valorventa();
                      return validar_descripcion();
                      return validar_stockmax();
                      return validar_stockmin();
                      return validar_stockactual();
                      return validar_idbodega();
                      return false;
                    }
                        
               }
               function validar_id(){
                   var id=document.form.txtIdProducto.value;
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
               function validar_nombre(){
                 var nombre=document.form.txtNombreProd.value;
                 var error1=document.getElementById("error1");
                 var valida1= /^[a-z-A-Z]{1,30}$/;
                 if(nombre==""){
                     error1.textContent=" Ingrese Nombre";
                     return false;
                 }
                 else if(nombre.length>30){
                     error1.textContent=" Supero el tamaño del Texto";
                     return false;
                 }
                 else if(!valida1.test(nombre)){
                     error1.textContent=" Contiene parametros invalidos";
                     return false;
                 }else{
                     return true;
                 }
                     
               }
                function validar_valorneto(){
                   var valorneto=document.form.txtValorNeto.value;
                   var error2=document.getElementById("error2");
                   if(id==0){
                       error2.textContent=" Ingrese Valor Neto";
                       return false;
                   }
                   else if(valorneto<0){
                       error2.textContent=" No existen valores negativos";
                       return false;
                   }
                   else if(isNaN(valorneto)){
                       error2.textContent=" Solo se permiten numeros";
                       return false;
                   }else{
                       return true;
                   }

               }
               
                   function validar_valorventa(){
                   var valorventa=document.form.txtValorVenta.value;
                   var error3=document.getElementById("error3");
                   if(id==0){
                       error3.textContent=" Ingrese Valor Venta";
                       return false;
                   }
                   else if(valorventa<0){
                       error3.textContent=" No existen valores negativos";
                       return false;
                   }
                   else if(isNaN(valorventa)){
                       error3.textContent=" Solo se permiten numeros";
                       return false;
                   }else{
                       return true;
                   }

               }
               
                 function validar_descripcion(){
                 var Descripcion=document.form.txtDescripcion.value;
                 var error4=document.getElementById("error4");
                 var valida2= /^[a-z-A-Z]{1,30}$/;
                 if(Descripcion==""){
                     error4.textContent=" Ingrese Descripcion";
                     return false;
                 }
                 else if(Descripcion.length>30){
                     error4.textContent=" Supero el tamaño del Texto";
                     return false;
                 }
                 else if(!valida2.test(Descripcion)){
                     error4.textContent=" Contiene parametros invalidos";
                     return false;
                 }else{
                     return true;
                 }
                     
               }
                              
                   function validar_stockmax(){
                   var stockmax=document.form.txtStockMax.value;
                   var error5=document.getElementById("error5");
                   if(stockmax==0){
                       error5.textContent=" Ingrese Stock Maximo";
                       return false;
                   }
                   else if(stockmax<0){
                       error5.textContent=" No existen valores negativos";
                       return false;
                   }
                   else if(isNaN(stockmax)){
                       error5.textContent=" Solo se permiten numeros";
                       return false;
                   }else{
                       return true;
                   }

               }
               
                   function validar_stockmin(){
                   var stockmin=document.form.txtStockMin.value;
                   var error6=document.getElementById("error6");
                   if(stockmin==0){
                       error6.textContent=" Ingrese Stock Minimo";
                       return false;
                   }
                   else if(stockmin<0){
                       error6.textContent=" No existen valores negativos";
                       return false;
                   }
                   else if(isNaN(stockmin)){
                       error6.textContent=" Solo se permiten numeros";
                       return false;
                   }else{
                       return true;
                   }

               }
               
                   function validar_stockactual(){
                   var stockactual=document.form.txtStockActual.value;
                   var error7=document.getElementById("error7");
                   if(stockactual==0){
                       error7.textContent=" Ingrese Stock Actual";
                       return false;
                   }
                   else if(stockactual<0){
                       error7.textContent=" No existen valores negativos";
                       return false;
                   }
                   else if(isNaN(stockactual)){
                       error7.textContent=" Solo se permiten numeros";
                       return false;
                   }else{
                       return true;
                   }

               }
               
                  function validar_idbodega(){
                   var idbodega=document.form.txtIdBodega.value;
                   var error8=document.getElementById("error8");
                   if(idbodega==0){
                       error8.textContent=" Ingrese ID Bodega";
                       return false;
                   }
                   else if(idbodega<0){
                       error8.textContent=" No existen valores negativos";
                       return false;
                   }
                   else if(isNaN(idbodega)){
                       error8.textContent=" Solo se permiten numeros";
                       return false;
                   }else{
                       return true;
                   }

               }

               function borrar_id(){
                   var borrar=document.getElementById("error")
                   borrar.textContent="";
               }
               function borrar_nombre(){
                   var borrar1=document.getElementById("error1")
                   borrar1.textContent="";
               }
               function borrar_valorneto(){
                   var borrar2=document.getElementById("error2")
                   borrar2.textContent="";
               }
               function borrar_valorventa(){
                   var borrar3=document.getElementById("error3")
                   borrar3.textContent="";
               }
               function borrar_descripcion(){
                   var borrar4=document.getElementById("error4")
                   borrar4.textContent="";
               }
               function borrar_stockmax(){
                   var borrar5=document.getElementById("error5")
                   borrar5.textContent="";
               }
               function borrar_stockmin(){
                   var borrar6=document.getElementById("error6")
                   borrar6.textContent="";
               }
               function borrar_stockactual(){
                   var borrar7=document.getElementById("error7")
                   borrar7.textContent="";
               }
               function borrar_idbodega(){
                   var borrar8=document.getElementById("error8")
                   borrar8.textContent="";
               }

         
         </script>
        
    </center>
        <a href="ConsultarProd.jsp"><input type="button" value="Atras"></a>
    </body>
</html>
