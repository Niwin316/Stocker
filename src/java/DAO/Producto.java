/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.Date;
/**
 *
 * @author NiwinPortatil
 */
public class Producto {

private int IDPRODUCTO;
private String NOMBREPROD;
private int VALOR_NETO;
private int VALOR_VENTA;
private String DESCRIPCION; 
private int STOCK_MAX;
private int STOCK_MIN;
private int STOCK_ACTUAL;
private int IDBODEGA;

    public Producto() {

    }

    public Producto(int IDPRODUCTO, String NOMBREPROD, int VALOR_NETO, int VALOR_VENTA, String DESCRIPCION, int STOCK_MAX,int STOCK_MIN,int STOCK_ACTUAL,int IDBODEGA) {
        this.IDPRODUCTO = IDPRODUCTO;
        this.NOMBREPROD = NOMBREPROD;
        this.VALOR_NETO = VALOR_NETO;
        this.VALOR_VENTA = VALOR_VENTA;
        this.DESCRIPCION = DESCRIPCION;
        this.STOCK_MAX = STOCK_MAX;
        this.STOCK_MIN = STOCK_MIN;
        this.STOCK_ACTUAL = STOCK_ACTUAL;
        this.IDBODEGA = IDBODEGA;
    }

    public int getIDPRODUCTO() {
        return IDPRODUCTO;
    }

    public void setIDPRODUCTO(int IDPRODUCTO) {
        this.IDPRODUCTO = IDPRODUCTO;
    }

    public String getNOMBREPROD() {
        return NOMBREPROD;
    }

    public void setNOMBREPROD(String NOMBREPROD) {
        this.NOMBREPROD = NOMBREPROD;
    }

    public int getVALOR_NETO() {
        return VALOR_NETO;
    }

    public void setVALOR_NETO(int VALOR_NETO) {
        this.VALOR_NETO = VALOR_NETO;
    }

    public int getVALOR_VENTA() {
        return VALOR_VENTA;
    }

    public void setVALOR_VENTA(int VALOR_VENTA) {
        this.VALOR_VENTA = VALOR_VENTA;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public int getSTOCK_MAX() {
        return STOCK_MAX;
    }

    public void setSTOCK_MAX(int STOCK_MAX) {
        this.STOCK_MAX = STOCK_MAX;
    }

    public int getSTOCK_MIN() {
        return STOCK_MIN;
    }

    public void setSTOCK_MIN(int STOCK_MIN) {
        this.STOCK_MIN = STOCK_MIN;
    }

    public int getSTOCK_ACTUAL() {
        return STOCK_ACTUAL;
    }

    public void setSTOCK_ACTUAL(int STOCK_ACTUAL) {
        this.STOCK_ACTUAL = STOCK_ACTUAL;
    }

    public int getIDBODEGA() {
        return IDBODEGA;
    }

    public void setIDBODEGA(int IDBODEGA) {
        this.IDBODEGA = IDBODEGA;
    }

    

}
