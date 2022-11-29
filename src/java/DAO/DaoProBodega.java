
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
public class DaoProBodega {
    PreparedStatement ps;
    ResultSet rs;
    Conexion c=new Conexion();
    Connection con;
    
    public List listarBodega(){
    List<Bodega> lista= new ArrayList<>();
    String sql="select * from BODEGA";
    try{
        con=c.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()){
            Bodega bo=new Bodega();
            bo.setIDBODEGA(rs.getInt(1));
            bo.setNOMBRE(rs.getString(2));
            bo.setTIENDA(rs.getString(3));
            bo.setDIRECCION(rs.getString(4));

            lista.add(bo);
        }
    }catch (Exception e) {     
        
    }
      return lista;
    }
    
     public Bodega listarIdBod(int id){
        String sql= "select * from BODEGA WHERE IDBODEGA ="+id;
        Bodega bod=new Bodega();
        try {
        con=c.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()){
            bod.setIDBODEGA(rs.getInt(1));
            bod.setNOMBRE(rs.getString(2));
            bod.setTIENDA(rs.getString(3));
            bod.setDIRECCION(rs.getString(4));
            }
        }catch (Exception e){    
            
        }
        return bod;
        }
     
       
    
     public int ActualizarBodega(Bodega bod){
        int r=0;
         String sql="update BODEGA set NOMBRE=?, TIENDA=?, DIRECCION=? where IDBODEGA=?";      
         try{
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1,bod.getNOMBRE());
            ps.setString(2, bod.getTIENDA());
            ps.setString(3, bod.getDIRECCION());
            ps.setInt(4, bod.getIDBODEGA());
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
     
      public int AgregarBodega(Bodega bod){
        int r=0;
        String sql="insert into BODEGA values(?,?,?,?)";
        try{
         con=c.conectar();
         ps=con.prepareStatement(sql);
            ps.setInt(1, bod.getIDBODEGA());
            ps.setString(2,bod.getNOMBRE());
            ps.setString(3, bod.getTIENDA());
            ps.setString(4, bod.getDIRECCION());
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
      
        public void elimarBodega(int id) {
        String sql = "delete from BODEGA where IDBODEGA="+id;
        try{
        con= c.conectar();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        }catch (Exception e){
            
        }
        
    }    
        
    public List BuscarBod(int id){
    List<Bodega> lista= new ArrayList<>();
    String sql="select * from BODEGA where IDBODEGA="+id;
    try{
        con=c.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()){
            Bodega bo=new Bodega();
            bo.setIDBODEGA(rs.getInt(1));
            bo.setNOMBRE(rs.getString(2));
            bo.setTIENDA(rs.getString(3));
            bo.setDIRECCION(rs.getString(4));

            lista.add(bo);
        }
    }catch (Exception e) {     
        
    }
      return lista;
    }
    
}
