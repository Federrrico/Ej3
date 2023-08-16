/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

/**
 *
 * @author federico.acenjo
 */
public class Producto {
    private String nombreP;
    private Double precioP;
    private String categoriaP;

    public Producto(String categoriaP, String nombreP, Double precioP) {
        this.nombreP = nombreP;
        this.precioP = precioP;
        this.categoriaP = categoriaP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public Double getPrecioP() {
        return precioP;
    }

    public void setPrecioP(Double precioP) {
        this.precioP = precioP;
    }

    public String getCategoriaP() {
        return categoriaP;
    }

    public void setCategoriaP(String categoriaP) {
        this.categoriaP = categoriaP;
    }

    @Override
    public String toString() {
        return "nombreP= " + nombreP + ", precioP= " + precioP + ", categoriaP= " + categoriaP;
    }
    
    
}
