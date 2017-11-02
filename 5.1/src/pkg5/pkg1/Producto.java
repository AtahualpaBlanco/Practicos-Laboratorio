/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg1;

/**
 *
 * @author ULP
 */
public abstract class Producto {
    
    private String codigo;
    private String descripcion;
    private double preiobase;
    private int cantidadventa;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPreiobase() {
        return preiobase;
    }

    public void setPreiobase(double preiobase) {
        this.preiobase = preiobase;
    }

    public int getCantidadventa() {
        return cantidadventa;
    }

    public void setCantidadventa(int cantidadventa) {
        this.cantidadventa = cantidadventa;
    }
    
    public abstract double CalcularPrecio();
    
}
