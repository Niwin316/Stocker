package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Menu</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"contenedor1\">\n");
      out.write("        <h1>Menu de Navegacion</h1>\n");
      out.write("        <br>\n");
      out.write("        <form id=\"Menu\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<nav>\n");
      out.write("    <ul>\n");
      out.write("\n");
      out.write("        <a href=\"ConsultarProd.jsp\"><input type=\"button\" value=\"Mantendedor de Productos\"></a> <br>\n");
      out.write("        <a href=\"ConsultaBod.jsp\"><input type=\"button\" value=\"Mantendedor de Bodegas\"></a> <br>\n");
      out.write("        <a href=\"ConsultaProve.jsp\"><input type=\"button\" value=\"Mantendedor de Proveedores\"></a> <br>\n");
      out.write("        <a href=\"Reportes.jsp\"><input type=\"button\" value=\"Reportes\"></a> <br>\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"rrss\">\n");
      out.write("        <ul class=\"social\">\n");
      out.write("            <li><a href=\"https://es-la.facebook.com/\" target=\"_blank\"><img src=\"assets/facebook.png\" width=\"30\" height=\"30\"></a></li>\n");
      out.write("            <li><a href=\"https://www.instagram.com/?hl=es-la\" target=\"_blank\"><img src=\"assets/instagram.png\" width=\"30\" height=\"30\"></a></li>\n");
      out.write("            <li><a href=\"https://www.twitter.com/\" target=\"_blank\"><img src=\"assets/twitter.png\" width=\"30\" height=\"30\"></a></li>\n");
      out.write("            <li><a href=\"https://www.linkedin.com/home\" target=\"_blank\"><img src=\"assets/linkedin.png\" width=\"30\" height=\"30\"></a></li>\n");
      out.write("            <li><a href=\"https://homer.sii.cl/\" target=\"_blank\"><img src=\"assets/sii.png\" width=\"50\" height=\"25\"></a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
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
