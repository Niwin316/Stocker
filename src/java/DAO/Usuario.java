/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author NiwinPortatil
 */
public class Usuario {


    
    private String idUsuario;
    private String nombre;
    private String apellido;
    private String clave;
    private int tipo;
    private String email;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean loguin(String idUsuario, String clave) {
        boolean resultado = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String strCon = "jdbc:mysql://localhost/prototipo";
            Connection con = DriverManager.getConnection(strCon, "root", "");
            String query = "select IDUSUARIO, NOMBRE, APELLIDO, TIPO from usuario where IDUSUARIO = ? and CLAVE =?";
            PreparedStatement smt = con.prepareStatement(query);
            smt.setString(1, idUsuario);
            smt.setString(2, clave);
            ResultSet res = smt.executeQuery();
            if (res.next()) {
                this.idUsuario = res.getString("IDUSUARIO");
                nombre = res.getString("NOMBRE");
                apellido = res.getString("APELLIDO");
                tipo = res.getInt("TIPO");     
                resultado = true;
            }
            res.close();
            smt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
}

