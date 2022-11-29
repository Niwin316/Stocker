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
public class Bodega {
    
    private int IDBODEGA;
    private String NOMBRE;
    private String TIENDA;
    private String DIRECCION;
    
    public Bodega() {

    }
    
    public Bodega(int IDBODEGA, String NOMBRE, String TIENDA, String DIRECCION) {
        
        this.IDBODEGA = IDBODEGA;
        this.NOMBRE = NOMBRE;
        this.TIENDA = TIENDA;
        this.DIRECCION = DIRECCION;
    }

    public int getIDBODEGA() {
        return IDBODEGA;
    }

    public void setIDBODEGA(int IDBODEGA) {
        this.IDBODEGA = IDBODEGA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getTIENDA() {
        return TIENDA;
    }

    public void setTIENDA(String TIENDA) {
        this.TIENDA = TIENDA;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }
    
}
