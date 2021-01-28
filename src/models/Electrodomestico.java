package models;

/**
 *
 * @author WIN-10
 */
public class Electrodomestico {
    //constructor con 4 parámetros
    public Electrodomestico( double peso, double precioBase, char consumoEnergetico,String color){
        this.peso = peso;
        this.precioBase = precioBase; 
        this.consumoEnergetico = consumoEnergetico;
        this.color = color;
   }
    
   //atributos privados
    private String color;
    private double peso;
    private char consumoEnergetico;
    private double precioBase;
    
    //Métodos set y get atributos Electrodomestico
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
       

}
