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
public class Inhalambrico extends Telefono {
    
    private int canal;
    private double alcance;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }
    
    public Inhalambrico(long numero, String modelo, String marca,int canal, double alcance)
    {
    super(numero,modelo,marca);
    this.alcance=alcance;
    this.canal=canal;
    }
    public  boolean Llamar(long nroDestino)
    {
        return false;
    }
}
