

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Proveedor</title>
    </head>
    <body>
        <h1>Ingresar Proveedor</h1>
        <center>
        <div>
            <form name="form" action="Controlador" method="POST">
                ID Proveedor: <br>
                <input type="number" onclick="borrar_id();" name="txtIdProv">
                <label id="error" style="color:red"></label><br>
                Nombre Proveedor: <br>
                <input type="text" onclick="borrar_nombre();" name="txtNombreProv">
                <label id="error1" style="color:red"></label><br>
                Apellido: <br>
                <input type="text" onclick="borrar_apellido();" name="txtApellidoProv">
                <label id="error2" style="color:red"></label><br>
                Direccion: <br>
                <input type="text" onclick="borrar_direccion();" name="txtDireccion">
                <label id="error3" style="color:red"></label><br>
                Telefono: <br>
                <input type="number" onclick="borrar_telefono();" name="txtTelefono">
                <label id="error4" style="color:red"></label><br>
                Email: <br>
                <input type="text" onclick="validar_email();" name="txtEmail"> 
                <label id="error5" style="color:red"></label><br>
                ID Producto: <br>
                <input type="number" onclick="borrar_idproducto();" name="txtIdProducto"> <br>
                <label id="error6" style="color:red"></label><br>


                <input onclick="return validar();" type="submit" name="accion" value="Guardar Proveedor"> <br>
            </form>
        </div>
    </center>
    
     <script>
                  function validar(){
                  if(!validar_id() || !validar_nombre() || !validar_apellido() || !validar_direccion()) || !validar_telefono() || !validar_email() || !validar_idproducto()){ 
                      return validar_id();
                      return validar_nombre(); 
                      return validar_apellido();
                      return validar_direccion();
                      return validar_telefono();
                      return validar_email();
                      return validar_idproducto();
                      return false;
                    }
                        
               }
               function validar_id(){
                   var id=document.form.txtIdProv.value;
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
                 var nombre=document.form.txtNombreProv.value;
                 var error1=document.getElementById("error1");
                 var valida= /^[a-z-A-Z]{1,30}$/;
                 if(nombre==""){
                     error1.textContent=" Ingrese Nombre";
                     return false;
                 }
                 else if(nombre.length>30){
                     error1.textContent=" Supero el tamaño del Texto";
                     return false;
                 }
                 else if(!valida.test(nombre)){
                     error1.textContent=" Contiene parametros invalidos";
                     return false;
                 }else{
                     return true;
                 }
                     
               }
                
                 function validar_apellido(){
                 var apellido=document.form.txtApellidoProv.value;
                 var error2=document.getElementById("error2");
                 var valida1= /^[a-z-A-Z]{1,30}$/;
                 if(apellido==""){
                     error2.textContent=" Ingrese Apellido";
                     return false;
                 }
                 else if(apellido.length>30){
                     error2.textContent=" Supero el tamaño del Texto";
                     return false;
                 }
                 else if(!valida1.test(apellido)){
                     error2.textContent=" Contiene parametros invalidos";
                     return false;
                 }else{
                     return true;
                 }
                     
               }
    
                 function validar_direccion(){
                 var direccion=document.form.txtDireccion.value;
                 var error3=document.getElementById("error3");
                 var valida2= /^[a-z-A-Z]{1,50}$/;
                 if(direccion==""){
                     error3.textContent=" Ingrese Direccion";
                     return false;
                 }
                 else if(direccion.length>50){
                     error3.textContent=" Supero el tamaño del Texto";
                     return false;
                 }
                 else if(!valida2.test(direccion)){
                     error3.textContent=" Contiene parametros invalidos";
                     return false;
                 }else{
                     return true;
                 }
                     
               }
               function validar_telefono(){
                   var telefono=document.form.txtTelefono.value;
                   var error4=document.getElementById("error4");
                   if(telefono==0){
                       error4.textContent=" Ingrese Telefono";
                       return false;
                   }
                   else if(telefono<0){
                       error4.textContent=" No existen valores negativos";
                       return false;
                   }
                   else if(isNaN(telefono)){
                       error4.textContent=" Solo se permiten numeros";
                       return false;
                   }else{
                       return true;
                   }

               }
               
                function validar_email(){
                 var email=document.form.txtEmail.value;
                 var error5=document.getElementById("error3");
                 var valida3= /^[a-z-0-9]+@+[a-z]+.+[a-z]$/;
                 if(email==""){
                     error5.textContent=" Ingrese Email";
                     return false;
                 }
                 else if(email.length>250){
                     error5.textContent=" Supero el tamaño del Texto";
                     return false;
                 }
                 else if(!valida3.test(email)){
                     error5.textContent=" Contiene parametros invalidos";
                     return false;
                 }else{
                     return true;
                 }
                     
               }
               function validar_idproducto(){
                   var idproducto=document.form.txtTelefono.value;
                   var error6=document.getElementById("error6");
                   if(idproducto==0){
                       error6.textContent=" Ingrese ID Producto";
                       return false;
                   }
                   else if(idproducto<0){
                       error6.textContent=" No existen valores negativos";
                       return false;
                   }
                   else if(isNaN(idproducto)){
                       error6.textContent=" Solo se permiten numeros";
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
               function borrar_apellido(){
                   var borrar2=document.getElementById("error2")
                   borrar2.textContent="";
               }
               function borrar_direccion(){
                   var borrar3=document.getElementById("error3")
                   borrar3.textContent="";
               }
               function borrar_telefono(){
                   var borrar4=document.getElementById("error4")
                   borrar4.textContent="";
               }
               function borrar_email(){
                   var borrar5=document.getElementById("error5")
                   borrar5.textContent="";
               }
               function borrar_idproducto(){
                   var borrar6=document.getElementById("error6")
                   borrar6.textContent="";
               }
         
         </script>
    
    
        <a href="ConsultaProve.jsp"><input type="button" value="Atras"></a>
    </body>
</html>
