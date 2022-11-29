

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Bodega</title>
    </head>
    <body>
        <h1>Ingresar Bodega</h1>
        <center>
        <div>
            <form name="form" action="Controlador" method="POST">
                ID Bodega: <br>
                <input type="number" onclick="borrar_id();" name="txtIdBodega">
                <label id="error3" style="color:red"></label><br>
                Nombre Bodega: <br>
                <input type="text" onclick="borrar_nombre();" name="txtNombre">
                <label id="error" style="color:red"></label><br>
                Tienda: <br>
                <input type="text" onclick="borrar_tienda();" name="txtTienda">
                <label id="error1" style="color:red"></label><br>
                Direccion: <br>
                <input type="text" onclick="borrar_direccion()" name="txtDireccion">
                <label id="error2" style="color:red"></label><br>
                <input onclick="return validar();" type="submit" name="accion" value="Guardar Bodega"> <br>
            </form>
        </div>
            <script>
                  function validar(){
                  if(!validar_id() || !validar_nombre() || !validar_tienda() || !validar_direccion()){ 
                      return validar_id();
                      return validar_nombre(); 
                      return validar_tienda(); 
                      return validar_direccion();
                      return false;
                    }
                        
               }
               function validar_id(){
                   var id=document.form.txtIdBodega.value;
                   var error3=document.getElementById("error3");
                   if(id==0){
                       error3.textContent=" Ingrese ID";
                       return false;
                   }
                   else if(id<0){
                       error3.textContent=" No existen valores negativos";
                       return false;
                   }
                   else if(isNaN(id)){
                       error3.textContent=" Solo se permiten numeros";
                       return false;
                   }else{
                       return true;
                   }

               }
               function validar_nombre(){
                 var nombre=document.form.txtNombre.value;
                 var error=document.getElementById("error");
                 var valida= /^[a-z-A-Z]{1,30}$/;
                 if(nombre==""){
                     error.textContent=" Ingrese Nombre";
                     return false;
                 }
                 else if(nombre.length>30){
                     error.textContent=" Supero el tamaño del Texto";
                     return false;
                 }
                 else if(!valida.test(nombre)){
                     error.textContent=" Contiene parametros invalidos";
                     return false;
                 }else{
                     return true;
                 }
                     
               }
                 function validar_tienda(){
                 var tienda=document.form.txtTienda.value;
                 var error1=document.getElementById("error1");
                 var valida1= /^[a-z-A-Z]{1,30}$/;
                 if(tienda==""){
                     error1.textContent=" Ingrese Nombre";
                     return false;
                 }
                 else if(tienda.length>30){
                     error1.textContent=" Supero el tamaño del Texto";
                     return false;
                 }
                 else if(!valida1.test(tienda)){
                     error1.textContent=" Contiene parametros invalidos";
                     return false;
                 }else{
                     return true;
                 }
                     
               }
                 function validar_direccion(){
                 var direccion=document.form.txtDireccion.value;
                 var error2=document.getElementById("error2");
                 var valida2= /^[a-z-A-Z]{1,50}$/;
                 if(direccion==""){
                     error2.textContent=" Ingrese Direccion";
                     return false;
                 }
                 else if(direccion.length>50){
                     error2.textContent=" Supero el tamaño del Texto";
                     return false;
                 }
                 else if(!valida2.test(direccion)){
                     error2.textContent=" Contiene parametros invalidos";
                     return false;
                 }else{
                     return true;
                 }
                     
               }
               function borrar_id(){
                   var borrar3=document.getElementById("error3")
                   borrar3.textContent="";
               }
               function borrar_nombre(){
                   var borrar=document.getElementById("error")
                   borrar.textContent="";
               }
               function borrar_tienda(){
                   var borrar1=document.getElementById("error1")
                   borrar1.textContent="";
               }
               function borrar_direccion(){
                   var borrar2=document.getElementById("error2")
                   borrar2.textContent="";
               }     
        </script>
    </center>
        <a href="ConsultaBod.jsp"><input type="button" value="Atras"></a>
    </body>
</html>
