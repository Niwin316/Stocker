
<%@page import="DAO.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="javascrip/validaciones.js" type="text/javascript"></script>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....Bienvenido ::...</title>
    </head>
    <body>
        <%
           String mensaje = (String) session.getAttribute(" mensaje");
           if(mensaje != null){
           out.println("<h1>" + mensaje + "</h1>");
           session.setAttribute("mensaje", null);
           }
        %>
     


        
        <div id="contenedor1">
            <form id="form1" action="Login.jsp" method="POST">
            <h1>Registrarse<h1>
            <input id="user" type="text" name="idUsuario" placeholder="Usuario">
            <hr>        
            <input id ="pass" type="password" name="clave" placeholder="Clave">
            <hr>        
            <input type="submit" value="Login" onclick="return validarCamposVaciosLogin();" >
        </form>
        </div>
        
        
                <div class="center">
        <h1 id="captchaHeading">Valida si eres humano</h1>
        <div id="captchaBackground">
            <canvas id="captcha">captcha text</canvas>
            <br>
            <input id="textBox" type="text" name="text">
            <div id="buttons">
                <br>
                <input id="submitButton" type="submit">
                <button id="refreshButton" type="submit">Refrescar</button> <span id="output"></span>
    
        <br>
    </div>

                <script>

let captchaText = document.querySelector('#captcha');
var ctx = captchaText.getContext("2d");
ctx.font = "30px Roboto";
ctx.fillStyle = "#08e5ff";


let userText = document.querySelector('#textBox');
let submitButton = document.querySelector('#submitButton');
let output = document.querySelector('#output');
let refreshButton = document.querySelector('#refreshButton');
let alphaNums = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'];
let emptyArr = [];
for (let i = 1; i <= 7; i++) {
    emptyArr.push(alphaNums[Math.floor(Math.random() * alphaNums.length)]);
}
var c = emptyArr.join('');
ctx.fillText(emptyArr.join(''),captchaText.width/4, captchaText.height/2);
userText.addEventListener('keyup', function(e) {
	// Key Code Value of "Enter" Button is 13
    if (e.keyCode === 13) {
        if (userText.value === c) {
            output.classList.add("correctCaptcha");
            output.innerHTML = "Correcto!";
        } else {
            output.classList.add("incorrectCaptcha");
            output.innerHTML = "Incorrecto, por favor intenta nuevamente";
        }
    }
});
submitButton.addEventListener('click', function() {
    if (userText.value === c) {
        output.classList.add("correctCaptcha");
        output.innerHTML = "Correcto!";
    } else {
        output.classList.add("incorrectCaptcha");
        output.innerHTML = "Incorrecto, por favor intenta nuevamente";
    }
});
refreshButton.addEventListener('click', function() {
    userText.value = "";
    let refreshArr = [];
    for (let j = 1; j <= 7; j++) {
        refreshArr.push(alphaNums[Math.floor(Math.random() * alphaNums.length)]);
    }
    ctx.clearRect(0, 0, captchaText.width, captchaText.height);
    c = refreshArr.join('');
    ctx.fillText(refreshArr.join(''),captchaText.width/4, captchaText.height/2);
    output.innerHTML = "";
});


            </script>
        
        
        
        
    </body>
</html>
