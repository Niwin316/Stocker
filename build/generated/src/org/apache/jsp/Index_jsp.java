package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.Usuario;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script src=\"javascrip/validaciones.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>.....Bienvenido ::...</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

           String mensaje = (String) session.getAttribute(" mensaje");
           if(mensaje != null){
           out.println("<h1>" + mensaje + "</h1>");
           session.setAttribute("mensaje", null);
           }
        
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"contenedor1\">\n");
      out.write("            <form id=\"form1\" action=\"Login.jsp\" method=\"POST\">\n");
      out.write("            <h1>Registrarse<h1>\n");
      out.write("            <input id=\"user\" type=\"text\" name=\"idUsuario\" placeholder=\"Usuario\">\n");
      out.write("            <hr>        \n");
      out.write("            <input id =\"pass\" type=\"password\" name=\"clave\" placeholder=\"Clave\">\n");
      out.write("            <hr>        \n");
      out.write("            <input type=\"submit\" value=\"Login\" onclick=\"return validarCamposVaciosLogin();\" >\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("                <div class=\"center\">\n");
      out.write("        <h1 id=\"captchaHeading\">Valida si eres humano</h1>\n");
      out.write("        <div id=\"captchaBackground\">\n");
      out.write("            <canvas id=\"captcha\">captcha text</canvas>\n");
      out.write("            <br>\n");
      out.write("            <input id=\"textBox\" type=\"text\" name=\"text\">\n");
      out.write("            <div id=\"buttons\">\n");
      out.write("                <br>\n");
      out.write("                <input id=\"submitButton\" type=\"submit\">\n");
      out.write("                <button id=\"refreshButton\" type=\"submit\">Refrescar</button> <span id=\"output\"></span>\n");
      out.write("    \n");
      out.write("        <br>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("                <script>\n");
      out.write("\n");
      out.write("let captchaText = document.querySelector('#captcha');\n");
      out.write("var ctx = captchaText.getContext(\"2d\");\n");
      out.write("ctx.font = \"30px Roboto\";\n");
      out.write("ctx.fillStyle = \"#08e5ff\";\n");
      out.write("\n");
      out.write("\n");
      out.write("let userText = document.querySelector('#textBox');\n");
      out.write("let submitButton = document.querySelector('#submitButton');\n");
      out.write("let output = document.querySelector('#output');\n");
      out.write("let refreshButton = document.querySelector('#refreshButton');\n");
      out.write("let alphaNums = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'];\n");
      out.write("let emptyArr = [];\n");
      out.write("for (let i = 1; i <= 7; i++) {\n");
      out.write("    emptyArr.push(alphaNums[Math.floor(Math.random() * alphaNums.length)]);\n");
      out.write("}\n");
      out.write("var c = emptyArr.join('');\n");
      out.write("ctx.fillText(emptyArr.join(''),captchaText.width/4, captchaText.height/2);\n");
      out.write("userText.addEventListener('keyup', function(e) {\n");
      out.write("\t// Key Code Value of \"Enter\" Button is 13\n");
      out.write("    if (e.keyCode === 13) {\n");
      out.write("        if (userText.value === c) {\n");
      out.write("            output.classList.add(\"correctCaptcha\");\n");
      out.write("            output.innerHTML = \"Correcto!\";\n");
      out.write("        } else {\n");
      out.write("            output.classList.add(\"incorrectCaptcha\");\n");
      out.write("            output.innerHTML = \"Incorrecto, por favor intenta nuevamente\";\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("});\n");
      out.write("submitButton.addEventListener('click', function() {\n");
      out.write("    if (userText.value === c) {\n");
      out.write("        output.classList.add(\"correctCaptcha\");\n");
      out.write("        output.innerHTML = \"Correcto!\";\n");
      out.write("    } else {\n");
      out.write("        output.classList.add(\"incorrectCaptcha\");\n");
      out.write("        output.innerHTML = \"Incorrecto, por favor intenta nuevamente\";\n");
      out.write("    }\n");
      out.write("});\n");
      out.write("refreshButton.addEventListener('click', function() {\n");
      out.write("    userText.value = \"\";\n");
      out.write("    let refreshArr = [];\n");
      out.write("    for (let j = 1; j <= 7; j++) {\n");
      out.write("        refreshArr.push(alphaNums[Math.floor(Math.random() * alphaNums.length)]);\n");
      out.write("    }\n");
      out.write("    ctx.clearRect(0, 0, captchaText.width, captchaText.height);\n");
      out.write("    c = refreshArr.join('');\n");
      out.write("    ctx.fillText(refreshArr.join(''),captchaText.width/4, captchaText.height/2);\n");
      out.write("    output.innerHTML = \"\";\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
