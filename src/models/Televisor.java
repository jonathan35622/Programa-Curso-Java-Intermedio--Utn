
package models;

/**
 *
 * @author WIN-10
 */
public class Televisor extends Electrodomestico{
    
    
    //Atributos propios de televisor
    private int resolucion;
    private boolean sintonizadorTDT;
    
    //Constructor de 6 parámetros
    public Televisor(double peso,double precioBase, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT) {
        super( peso, precioBase, consumoEnergetico,  color);
         this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
    //Métodos set y get 
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    
}
