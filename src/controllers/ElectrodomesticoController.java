package controllers;

import static models.Constantes.CONSUMO_ENERGETICO_DEF;

/**
 *
 * @author WIN-10
 */
public class ElectrodomesticoController {

    
    
//Método público para determinar precio final del producto    
    public double precioFinal(char consumoEnergetico, double peso, double precioBase) {
        double plus = 0;
        switch (consumoEnergetico) {
            case 'A':
                plus += 100;
                break;
            case 'B':
                plus += 80;
                break;
            case 'C':
                plus += 60;
                break;
            case 'D':
                plus += 50;
                break;
            case 'E':
                plus += 30;
                break;
            case 'F':
                plus += 10;
                break;
        }

        if (peso >= 0 && peso < 19) {
            plus += 10;
        } else if (peso >= 20 && peso < 49) {
            plus += 50;
        } else if (peso >= 50 && peso <= 79) {
            plus += 80;
        } else if (peso >= 80) {
            plus += 100;
        }

        return precioBase + plus;
    }
    //Método público comprueba consumo energético del producto
    public char comprobarConsumoEnergetico(char consumoEnergetico) {
        char consumo;

        if (consumoEnergetico >= 65 && consumoEnergetico <= 70) {
            consumo = consumoEnergetico;
        } else {
            consumo = CONSUMO_ENERGETICO_DEF;
        }
        return consumo;
    }

}
