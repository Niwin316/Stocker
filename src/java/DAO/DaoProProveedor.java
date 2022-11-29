
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
public class DaoProProveedor {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c=new Conexion();
    Connection con;
    
    public List listarProveedores(){
    List<Proveedor> lista= new ArrayList<>();
    String sql="select * from PROVEEDOR";
    try{
        con=c.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()){
            Proveedor pr=new Proveedor();
            pr.setIDPROVEEDOR(rs.getInt(1));
            pr.setNOMBRE(rs.getString(2));
            pr.setAPELLIDO(rs.getString(3));
            pr.setDIRECCION(rs.getString(4));
            pr.setTELEFONO(rs.getInt(5));
            pr.setEMAIL (rs.getString(6));
            pr.setIDPRODUCTO(rs.getInt(7));
            lista.add(pr);
        }
        }catch (Exception e) {     
        
        }
        return lista;
        
      }
    
 public Proveedor listarIdProv(int id){
        String sql= "select * from PROVEEDOR WHERE IDPROVEEDOR ="+id;
        Proveedor prov=new Proveedor();
        try {
        con=c.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()){
            prov.setIDPROVEEDOR(rs.getInt(1));
            prov.setNOMBRE(rs.getString(2));
            prov.setAPELLIDO(rs.getString(3));
            prov.setDIRECCION(rs.getString(4));
            prov.setTELEFONO(rs.getInt(5));
            prov.setEMAIL(rs.getString(6));
            prov.setIDPRODUCTO(rs.getInt(7));
            }
        }catch (Exception e){    
        }
        return prov;
        }   
    
     public int ActualizarProveedor(Proveedor prov){
        int r=0;
         String sql="update PROVEEDOR set NOMBRE=?, APELLIDO=?, DIRECCION=?, TELEFONO=?, EMAIL=? where IDPROVEEDOR=?";      
         try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,prov.getNOMBRE());
            ps.setString(2, prov.getAPELLIDO());
            ps.setString(3, prov.getDIRECCION());
            ps.setInt(4, prov.getTELEFONO());
            ps.setString(5, prov.getEMAIL());
            ps.setInt(6, prov.getIDPROVEEDOR());
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
     
       public int AgregarProveedor(Proveedor prov){
        int r=0;
        String sql="insert into PROVEEDOR values(?,?,?,?,?,?,?)";
        try{
         con=c.conectar();
         ps=con.prepareStatement(sql);
            ps.setInt(1, prov.getIDPROVEEDOR());
            ps.setString(2,prov.getNOMBRE());
            ps.setString(3, prov.getAPELLIDO());
            ps.setString(4, prov.getDIRECCION());
            ps.setInt(5, prov.getTELEFONO());
            ps.setString(6, prov.getEMAIL());
            ps.setInt(7, prov.getIDPRODUCTO());
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
    
        public void elimarProveedor(int id) {
        String sql = "delete from PROVEEDOR where IDPROVEEDOR="+id;
        try{
        con= c.conectar();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        }catch (Exception e){
        }
        
    }    
        
    public List BuscarProve(int id){
    List<Proveedor> lista= new ArrayList<>();
    String sql="select * from PROVEEDOR where IDPROVEEDOR ="+id;
    try{
        con=c.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()){
            Proveedor pr=new Proveedor();
            pr.setIDPROVEEDOR(rs.getInt(1));
            pr.setNOMBRE(rs.getString(2));
            pr.setAPELLIDO(rs.getString(3));
            pr.setDIRECCION(rs.getString(4));
            pr.setTELEFONO(rs.getInt(5));
            pr.setEMAIL (rs.getString(6));
            pr.setIDPRODUCTO(rs.getInt(7));
            lista.add(pr);
        }
        }catch (Exception e) {     
            
        }
        return lista;
        
      }
    
}
