/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author NiwinPortatil
 */
public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost/Prototipo" ;
    String user="root" ;
    String pass="";
    public Connection conectar(){
        try {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection(url,user,pass);
        }catch (Exception e) {  
        }
        return con;
    }
    
    
}
