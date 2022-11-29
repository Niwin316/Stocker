package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NuevoProd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registro de Producto</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Ingresar Producto</h1>\n");
      out.write("    <center>\n");
      out.write("        <div>\n");
      out.write("            <form name=\"form\" action=\"Controlador\" method=\"POST\">\n");
      out.write("                ID Producto: <br>\n");
      out.write("                <input type=\"text\" name=\"txtIdProducto\"> <br>\n");
      out.write("                Nombre Producto: <br>\n");
      out.write("                <input type=\"text\" name=\"txtNombreProd\"> <br>\n");
      out.write("                Valor Neto: <br>\n");
      out.write("                <input type=\"text\" name=\"txtValorNeto\"> <br>\n");
      out.write("                Valor Venta: <br>\n");
      out.write("                <input type=\"text\" name=\"txtValorVenta\"> <br>\n");
      out.write("                Descripcion: <br>\n");
      out.write("                <input type=\"text\" name=\"txtDescripcion\"> <br>\n");
      out.write("                Stock Maximo: <br>\n");
      out.write("                <input type=\"text\" name=\"txtStockMax\"> <br>\n");
      out.write("                Stock Minimo: <br>\n");
      out.write("                <input type=\"text\" name=\"txtStockMin\"> <br>\n");
      out.write("                Stock Actual: <br>\n");
      out.write("                <input type=\"text\" name=\"txtStockActual\"> <br>\n");
      out.write("                ID Bodega: <br>\n");
      out.write("                <input type=\"text\" name=\"txtIdBodega\"> <br>\n");
      out.write("\n");
      out.write("                <input  type=\"submit\" name=\"accion\" value=\"Guardar Producto\" <br>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("        <a href=\"ConsultarProd.jsp\"><input type=\"button\" value=\"Atras\"></a>\n");
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
