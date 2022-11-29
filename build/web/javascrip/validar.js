/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Js Para validar login*/
function validar(){
    
    var usuario, clave;
    usuario = document.getElementById("usuario").value;
    clave = document.getElementById("clave").value;
    
    if(usuario === ""){
        alert ("El campo Username esta vacio");
        return false; //retorna falso para que al darle al boton aceptar en la ventana emergente no envie los datos 
    }else if(clave === ""){
        alert ("El campo Password esta vacio");
        return false; //retorna falso para que al darle al boton aceptar en la ventana emergente no envie los datos 
    }else if(clave.length < 5){
        alert ("El Password no puede ser menor a 5 Caracteres");
        clave = document.setElementById("clave").value = ""; // resetea el texto del campo passwoed a vacio
       return false;  
    }else if(clave.length > 10){
        alert ("El password no puede ser mayor a 10 Caracteres");
        clave = document.setElementById("clave").value = ""; // resetea el texto del campo passwoed a vacio
        return false;
    }   
}

/* Js Para validar Ingreso de producto*/



