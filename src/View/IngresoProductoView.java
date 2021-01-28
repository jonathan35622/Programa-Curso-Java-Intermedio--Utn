package View;

import javax.swing.JOptionPane;
import static models.Constantes.COLOR_DEF;
import static models.Constantes.CONSUMO_ENERGETICO_DEF;

/**
 *
 * @author WIN-10
 */
public class IngresoProductoView {

    //Método público pide peso del producto y precio producto
    public double opcionProducto(String introduccion) {
        String texto = JOptionPane.showInputDialog(null, introduccion);
       
        while (!isNumber(texto)) {//compruebo  que lo ingresado es un nuemero
            texto = JOptionPane.showInputDialog(null,
                    "No es un número. Por favor ingrese un número\n" + introduccion);
        }
        double opcion = Double.parseDouble(texto);
        return opcion;
    }

    public String eleccionColor() {
        String color = JOptionPane.showInputDialog(null, "Introduce el color que deseas\n  verde \n  azul\n negro\n  ").toLowerCase().trim();
        switch (color) {
            case "verde":
                JOptionPane.showMessageDialog(null, "eligió color verde");
                break;
            case "azul":
                JOptionPane.showMessageDialog(null, "eligió color azul");
                break;
            case "negro":
                JOptionPane.showMessageDialog(null, "eligió color negro");
                break;

            default:
                color = COLOR_DEF;
        }
        return color;

    }
    //método para seleccionar el tipo de consumo energético del producto
    public char elegirConsumoEnergia() {
        String consumo = JOptionPane.showInputDialog(null, "Introduce el tipo de consumo energético: \n A \n B \n C \n D \n E \n F ").toUpperCase().trim();
        char caracter = consumo.charAt(0);
        switch (caracter) {
            case 'A':
                JOptionPane.showMessageDialog(null, "eligió consumo tipo A");
                break;
            case 'B':
                JOptionPane.showMessageDialog(null, "eligió consumo tipo B");
                break;
            case 'C':
                JOptionPane.showMessageDialog(null, "eligió consumo tipo C");
                break;
            case 'D':
                JOptionPane.showMessageDialog(null, "eligió consumo tipo D");
                break;
            case 'E':
                JOptionPane.showMessageDialog(null, "eligió consumo tipo E");
                break;
            case 'F':
                JOptionPane.showMessageDialog(null, "eligió consumo tipo F");
                break;
            default:
                caracter = CONSUMO_ENERGETICO_DEF;
        }
        return caracter;

    }
    //metodo que da la opcion de ingresar otro producto
    public boolean seleccionarOtroProducto() {
        int retorno = JOptionPane.showConfirmDialog(null, "¿Desea otro producto?", "Opción", JOptionPane.YES_NO_OPTION);
        return retorno == JOptionPane.YES_OPTION;
    }

  
    private static boolean isNumber(String n) {
        try {
            Integer.parseInt(n);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
