/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import DAO.DaoPrototipo;
import DAO.DaoProProveedor;
import DAO.DaoProBodega;
import DAO.Producto;
import DAO.Bodega;
import DAO.Proveedor;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NiwinPortatil
 */
public class Controlador extends HttpServlet {
    
    
DaoPrototipo dao= new DaoPrototipo();
DaoProProveedor daoP = new DaoProProveedor();
DaoProBodega daoB = new DaoProBodega();
Producto pro= new Producto();
Bodega bod = new Bodega();
Proveedor prov = new Proveedor();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String accion= request.getParameter("accion");
       switch (accion) {
           
           case "Listar Productos":
           List<Producto>datos=dao.listarProductos();
           request.setAttribute("datos", datos);
           request.getRequestDispatcher("ConsultarProd.jsp").forward(request, response);
           break;
           
           case "Buscar Producto":
           int buscarID = Integer.parseInt(request.getParameter("txtBuscar"));
           List<Producto>buscarPro=dao.Buscar(buscarID);
           request.setAttribute("datos", buscarPro);
           request.getRequestDispatcher("ConsultarProd.jsp").forward(request, response);
           break;
           
           case "Listar Proveedores":
           List<Proveedor>datosP=daoP.listarProveedores();
           request.setAttribute("datos", datosP);
           request.getRequestDispatcher("ConsultaProve.jsp").forward(request, response);
           break;
           
           case "Buscar Proveedor":
           int buscarIDProve = Integer.parseInt(request.getParameter("txtBuscarProve"));
           List<Proveedor>buscarProve=daoP.BuscarProve(buscarIDProve);
           request.setAttribute("datos", buscarProve);
           request.getRequestDispatcher("ConsultaProve.jsp").forward(request, response);
           break;
           
           case "Listar Bodegas":
           List<Bodega>datosB=daoB.listarBodega();
           request.setAttribute("datos", datosB);
           request.getRequestDispatcher("ConsultaBod.jsp").forward(request, response);
           break;
           
           case "Buscar Bodega":
           int buscarIDbod = Integer.parseInt(request.getParameter("txtBuscarBod"));
           List<Bodega>buscarBod=daoB.BuscarBod(buscarIDbod);
           request.setAttribute("datos", buscarBod);
           request.getRequestDispatcher("ConsultaBod.jsp").forward(request, response);
           break;
           
           case "Agregar Producto":
           request.getRequestDispatcher("NuevoProd.jsp").forward(request, response);
           break;
           
           case "Agregar Proveedor":
           request.getRequestDispatcher("NuevoProve.jsp").forward(request, response);
           break;
           
           case "Agregar Bodega":
           request.getRequestDispatcher("NuevoBod.jsp").forward(request, response);
           break;
           
           case "Guardar Producto":
               int idProducto = Integer.parseInt(request.getParameter("txtIdProducto"));
               String NombreProducto = request.getParameter("txtNombreProd");
               int valorNeto = Integer.parseInt(request.getParameter("txtValorNeto"));
               int valorVenta = Integer.parseInt(request.getParameter("txtValorVenta"));
               String descripcion = request.getParameter("txtDescripcion");
               int stockMaximo = Integer.parseInt(request.getParameter("txtStockMax"));
               int stockMinimo = Integer.parseInt(request.getParameter("txtStockMin"));
               int stockActual = Integer.parseInt(request.getParameter("txtStockActual"));
               int idBodega = Integer.parseInt(request.getParameter("txtIdBodega"));
               pro.setIDPRODUCTO(idProducto);
               pro.setNOMBREPROD(NombreProducto);
               pro.setVALOR_NETO(valorNeto);
               pro.setVALOR_VENTA(valorVenta);
               pro.setDESCRIPCION(descripcion);
               pro.setSTOCK_MAX(stockMaximo);
               pro.setSTOCK_MIN(stockMinimo);
               pro.setSTOCK_ACTUAL(stockActual);
               pro.setIDBODEGA(idBodega);
               dao.AgregarProducto(pro);
               request.getRequestDispatcher("Controlador?accion=Listar Productos").forward(request, response);
           break;
              case "Editar Stock":
           int idSt=Integer.parseInt(request.getParameter("id"));
           Producto stk=dao.listarId(idSt);
           request.setAttribute("producto", stk);
           request.getRequestDispatcher("StockUP.jsp").forward(request, response);
                  break;
           
              case "Guardar Proveedor":
               int idProv = Integer.parseInt(request.getParameter("txtIdProv"));
               String nombreProv = request.getParameter("txtNombreProv");
               String apellidoprov= request.getParameter("txtApellidoProv");
               String direccionProv = request.getParameter("txtDireccion");
               int telefonoProv = Integer.parseInt(request.getParameter("txtTelefono"));
               String emailProv = request.getParameter("txtEmail");
               int idProductoProv = Integer.parseInt(request.getParameter("txtIdProducto"));
               prov.setIDPROVEEDOR(idProv);
               prov.setNOMBRE(nombreProv);
               prov.setAPELLIDO(apellidoprov);
               prov.setDIRECCION(direccionProv);
               prov.setTELEFONO(telefonoProv);
               prov.setEMAIL(emailProv);
               prov.setIDPRODUCTO(idProductoProv);
               daoP.AgregarProveedor(prov);
               request.getRequestDispatcher("Controlador?accion=Listar Proveedores").forward(request, response);
           break;
           
           case "Actualizar Proveedor":
               int idprovee=Integer.parseInt(request.getParameter("id"));
               String nomProve = request.getParameter("txtNombreProv");
               String apelliprove = request.getParameter("txtApellidoProv");
               String direcProve = request.getParameter("txtDireccion");
               int teleProve = Integer.parseInt(request.getParameter("txtTelefono"));
               String emailProve = request.getParameter("txtEmail");
               prov.setNOMBRE(nomProve);
               prov.setAPELLIDO(apelliprove);
               prov.setDIRECCION(direcProve);
               prov.setTELEFONO(teleProve);
               prov.setEMAIL(emailProve);
               prov.setIDPROVEEDOR(idprovee);
               daoP.ActualizarProveedor(prov);
               request.getRequestDispatcher("Controlador?accion=Listar Proveedores").forward(request, response);
           break;
           
           case "Guardar Bodega":
               int idBode = Integer.parseInt(request.getParameter("txtIdBodega"));
               String nombreBode = request.getParameter("txtNombre");
               String tiedaBode= request.getParameter("txtTienda");
               String direccionBode = request.getParameter("txtDireccion");
               bod.setIDBODEGA(idBode);
               bod.setNOMBRE(nombreBode);
               bod.setTIENDA(tiedaBode);
               bod.setDIRECCION(direccionBode);
               daoB.AgregarBodega(bod);
               request.getRequestDispatcher("Controlador?accion=Listar Bodegas").forward(request, response);
           break;
           
           case "Actualizar Bodega":
               int idBod=Integer.parseInt(request.getParameter("id"));
               String nomBod = request.getParameter("txtNombre");
               String tiendaBod = request.getParameter("txtTienda");
               String direccionBod = request.getParameter("txtDireccion");
               bod.setNOMBRE(nomBod);
               bod.setTIENDA(tiendaBod);
               bod.setDIRECCION(direccionBod);
               bod.setIDBODEGA(idBod);
               daoB.ActualizarBodega(bod);
               request.getRequestDispatcher("Controlador?accion=Listar Bodegas").forward(request, response);
           break;
           
           case "Actualizar":
               int id0=Integer.parseInt(request.getParameter("id"));
               String NomPro = request.getParameter("txtNombreProd");
               int valorNet = Integer.parseInt(request.getParameter("txtValorNeto"));
               int valorVent = Integer.parseInt(request.getParameter("txtValorVenta"));
               String descrip = request.getParameter("txtDescripcion");
               int stockMax = Integer.parseInt(request.getParameter("txtStockMax"));
               int stockMin = Integer.parseInt(request.getParameter("txtStockMin"));
               int stockAct = Integer.parseInt(request.getParameter("txtStockActual"));
               pro.setNOMBREPROD(NomPro);
               pro.setVALOR_NETO(valorNet);
               pro.setVALOR_VENTA(valorVent);
               pro.setDESCRIPCION(descrip);
               pro.setSTOCK_MAX(stockMax);
               pro.setSTOCK_MIN(stockMin);
               pro.setSTOCK_ACTUAL(stockAct);
               pro.setIDPRODUCTO(id0);
               dao.ActualizarProducto(pro);
               request.getRequestDispatcher("Controlador?accion=Listar Productos").forward(request, response);
           break;
           
           case "Actualizar Stock":
               int idAt=Integer.parseInt(request.getParameter("id"));
               int stockP = Integer.parseInt(request.getParameter("txtStockActual"));
               pro.setSTOCK_ACTUAL(stockP);
               pro.setIDPRODUCTO(idAt);
               dao.EditarStock(pro);
               request.getRequestDispatcher("Controlador?accion=Listar Productos").forward(request, response);
               
           break;
           
           case "Editar Producto":
           int id1=Integer.parseInt(request.getParameter("id"));
           Producto p=dao.listarId(id1);
           request.setAttribute("producto", p);
           request.getRequestDispatcher("EditarProd.jsp").forward(request, response);
           break;
           
           case "Editar Proveedor":
           int idProve=Integer.parseInt(request.getParameter("id"));
           Proveedor prove=daoP.listarIdProv(idProve);
           request.setAttribute("proveedor", prove);
           request.getRequestDispatcher("EditarProve.jsp").forward(request, response);
           break;
           
           case "Editar Bodega":
           int idBd=Integer.parseInt(request.getParameter("id"));
           Bodega bode=daoB.listarIdBod(idBd);
           request.setAttribute("bodega", bode);
           request.getRequestDispatcher("EditarBod.jsp").forward(request, response);
           break;
           
           
           case "Eliminar Producto":
              int id2 = Integer.parseInt(request.getParameter("id"));
              dao.eliminarProducto(id2);
              request.getRequestDispatcher("Controlador?accion=Listar Productos").forward(request, response);
           break;
           
           case "Eliminar Proveedor":
              int id3 = Integer.parseInt(request.getParameter("id"));
              daoP.elimarProveedor(id3);
              request.getRequestDispatcher("Controlador?accion=Listar Proveedores").forward(request, response);
           break;
           
           case "Eliminar Bodega":
              int id4 = Integer.parseInt(request.getParameter("id"));
              daoB.elimarBodega(id4);
              request.getRequestDispatcher("Controlador?accion=Listar Bodegas").forward(request, response);
           break;

           default:
               throw new AssertionError();
       }
       
       
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
