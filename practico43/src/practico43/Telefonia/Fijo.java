/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico43.Telefonia;

/**
 *
 * @author ULP
 */
public class Fijo extends Telefono {
    
    private String linea;
    
    public String getLinea()
    {
    return linea;
    }
    
    public void setLinea(String linea)
    {
    this.linea=linea;
    }
    
    public Fijo(long numero, String modelo, String marca, String linea)
    {
    super(numero,modelo,marca);
    this.linea=linea;
    }
    public  boolean Llamar(long nroDestino)
    {
        return false;
    }

}
