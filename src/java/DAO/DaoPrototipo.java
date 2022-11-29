
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
/**
 *
 * @author NiwinPortatil
 */
public class DaoPrototipo {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c=new Conexion();
    Connection con;
    
    public List listarProductos(){
    List<Producto> lista= new ArrayList<>();
    String sql="select * from PRODUCTO";
    try{
        con=c.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()){
            Producto req=new Producto();
            req.setIDPRODUCTO(rs.getInt(1));
            req.setNOMBREPROD(rs.getString(2));
            req.setVALOR_NETO(rs.getInt(3));
            req.setVALOR_VENTA(rs.getInt(4));
            req.setDESCRIPCION(rs.getString(5));
            req.setSTOCK_MAX(rs.getInt(6));
            req.setSTOCK_MIN(rs.getInt(7));
            req.setSTOCK_ACTUAL(rs.getInt(8));
            req.setIDBODEGA(rs.getInt(9));
            lista.add(req);
        }
    }catch (Exception e) {      
    }
      return lista;
    }

    public Producto listarId(int id){
        String sql= "select * from PRODUCTO WHERE IDPRODUCTO ="+id;
        Producto bs=new Producto();
        try {
        con=c.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()){
            bs.setIDPRODUCTO(rs.getInt(1));
            bs.setNOMBREPROD(rs.getString(2));
            bs.setVALOR_NETO(rs.getInt(3));
            bs.setVALOR_VENTA(rs.getInt(4));
            bs.setDESCRIPCION(rs.getString(5));
            bs.setSTOCK_MAX(rs.getInt(6));
            bs.setSTOCK_MIN(rs.getInt(7));
            bs.setSTOCK_ACTUAL(rs.getInt(8));
            bs.setIDBODEGA(rs.getInt(9));
            }
        }catch (Exception e){    
        }
        return bs;
        }

    public int ActualizarProducto(Producto pro){
        int r=0;
         String sql="update PRODUCTO set NOMBREPROD=?, VALOR_NETO=?, VALOR_VENTA=?, DESCRIPCION=?, STOCK_MAX=?, STOCK_MIN=?, STOCK_ACTUAL=? where IDPRODUCTO=?";      
         try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,pro.getNOMBREPROD());
            ps.setInt(2, pro.getVALOR_NETO());
            ps.setInt(3, pro.getVALOR_VENTA());
            ps.setString(4, pro.getDESCRIPCION());
            ps.setInt(5, pro.getSTOCK_MAX());
            ps.setInt(6, pro.getSTOCK_MIN());
            ps.setInt(7, pro.getSTOCK_ACTUAL());
            ps.setInt(8, pro.getIDPRODUCTO());
            r=ps.executeUpdate();
            if(r==1){
                r=1;
            }else{
                r=0;
            }
        }catch (Exception e){
            
         }
        return r;
    }
  

    public int AgregarProducto(Producto pro){
        int r=0;
        String sql="insert into PRODUCTO values(?,?,?,?,?,?,?,?,?)";
        try{
         con=c.conectar();
         ps=con.prepareStatement(sql);
            ps.setInt(1, pro.getIDPRODUCTO());
            ps.setString(2,pro.getNOMBREPROD());
            ps.setInt(3, pro.getVALOR_NETO());
            ps.setInt(4, pro.getVALOR_VENTA());
            ps.setString(5, pro.getDESCRIPCION());
            ps.setInt(6, pro.getSTOCK_MAX());
            ps.setInt(7, pro.getSTOCK_MIN());
            ps.setInt(8, pro.getSTOCK_ACTUAL());
            ps.setInt(9, pro.getIDBODEGA());
            r=ps.executeUpdate();
            if(r==1){
                r=1;
            }else{
                r=0;
            }
        }catch (Exception e){
         }
        return r;
    }
    
    public void eliminarProducto(int id ) {
       String sql = "delete from PRODUCTO where IDPRODUCTO="+id;
       try {
            con = c.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public List Buscar(int id){
    List<Producto> lista= new ArrayList<>();
    String sql="select * from PRODUCTO where IDPRODUCTO = "+id;
    try{
        con=c.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()){
            Producto req=new Producto();
            req.setIDPRODUCTO(rs.getInt(1));
            req.setNOMBREPROD(rs.getString(2));
            req.setVALOR_NETO(rs.getInt(3));
            req.setVALOR_VENTA(rs.getInt(4));
            req.setDESCRIPCION(rs.getString(5));
            req.setSTOCK_MAX(rs.getInt(6));
            req.setSTOCK_MIN(rs.getInt(7));
            req.setSTOCK_ACTUAL(rs.getInt(8));
            req.setIDBODEGA(rs.getInt(9));
            lista.add(req);
        }
    }catch (Exception e) {      
    }
      return lista;
    }
    
   public int EditarStock(Producto stk){
        int r=0;
         String sql="update PRODUCTO set STOCK_ACTUAL=? where IDPRODUCTO=?";      
         try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, stk.getSTOCK_ACTUAL());
            ps.setInt(2, stk.getIDPRODUCTO());
            r=ps.executeUpdate();
            if(r==1){
                r=1;
            }else{
                r=0;
            }
        }catch (Exception e){
            
         }
        return r;
    }
    

}
