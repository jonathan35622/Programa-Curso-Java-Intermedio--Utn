
package models;

/**
 *
 * @author WIN-10
 */
public class Lavarropa extends Electrodomestico{
    
      //atributo propio de lavarropa
      private int carga;
      //constructor de 5 parámetros 
    public Lavarropa( double peso,double precioBase, char consumoEnergetico, String color, int carga) {
        super( peso, precioBase, consumoEnergetico,  color);
        this.carga = carga;
    }
        //Método set y get del atributo carga
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

      
    
    
}
