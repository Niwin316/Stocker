/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author NiwinPortatil
 */
public class Proveedor {
    
    private int IDPROVEEDOR;
    private String NOMBRE;
    private String APELLIDO;
    private String DIRECCION;
    private int TELEFONO;
    private String EMAIL;
    private int IDPRODUCTO;
    
    
     public Proveedor() {

    }
     
     public Proveedor(int IDPROVEEDOR, String NOMBRE, String APELLIDO, String DIRECCION, int TELEFONO, String EMAIL, int IDPRODUCTO ) {
      
         this.IDPROVEEDOR = IDPROVEEDOR;
         this.NOMBRE = NOMBRE;
         this.APELLIDO = APELLIDO;
         this.DIRECCION = DIRECCION;
         this.TELEFONO = TELEFONO;
         this.EMAIL = EMAIL;
         this.IDPRODUCTO = IDPRODUCTO;
         
    }

    public int getIDPROVEEDOR() {
        return IDPROVEEDOR;
    }

    public void setIDPROVEEDOR(int IDPROVEEDOR) {
        this.IDPROVEEDOR = IDPROVEEDOR;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public int getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(int TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public int getIDPRODUCTO() {
        return IDPRODUCTO;
    }

    public void setIDPRODUCTO(int IDPRODUCTO) {
        this.IDPRODUCTO = IDPRODUCTO;
    }
     

}
