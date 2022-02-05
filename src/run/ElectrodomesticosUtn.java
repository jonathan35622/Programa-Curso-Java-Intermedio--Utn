package run;
import View.IngresoProductoView;
import controllers.ElectrodomesticoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Electrodomestico;
import models.Lavarropa;
import models.Televisor;
/**
 *
 * @author Jsuarez
 */
public class ElectrodomesticosUtn {
    public static void main(String[] args) {
        boolean otroProducto = false;
       //array que incrementa si se ingresan más elementos 
        ArrayList listaElectrodomesticos = new ArrayList(); 
        do {
            //pregunto si quiere ingresar otro producto 
            //seleccion guarda:
            //0 si elegio ELECTRODOMESTICO
            //1 si elegio LAVARROPA
            //2 si elegio TELEVISION
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opcion",
                    "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Electrodomestico", "Lavarropa", "Televisor"}, "Electrodomestico");

            //creo un objeto View donde estan todas las vistas
            IngresoProductoView ingresoProducto = new IngresoProductoView();

            String eleccionColor = ingresoProducto.eleccionColor();//ventana elegir color
            char energia = ingresoProducto.elegirConsumoEnergia();//ventana elegir consumo
            double eleccionPeso = ingresoProducto.opcionProducto("elegí el peso del producto");//ventana elegir peso
            double eleccionPrecioBase = ingresoProducto.opcionProducto("precio del producto que desea");//ventana elegir precio

            if (seleccion == 0) {
                listaElectrodomesticos.add(new Electrodomestico(eleccionPeso, eleccionPrecioBase, energia, eleccionColor));
            }
            if (seleccion == 1) {
                int eleccionCarga = (int) ingresoProducto.opcionProducto("ingrese la carga");
                listaElectrodomesticos.add(new Lavarropa(eleccionPeso, eleccionPrecioBase, energia, eleccionColor, eleccionCarga));
            }
            if (seleccion == 2) {
                int resolucion = (int) ingresoProducto.opcionProducto("ingrese la resolucion");
                listaElectrodomesticos.add(new Televisor(eleccionPeso,eleccionPrecioBase , energia, eleccionColor, resolucion, true));
            }
            otroProducto = ingresoProducto.seleccionarOtroProducto();
        } while (otroProducto);
        double sumaElectrodomesticos = 0;
        double sumaTelevisiones = 0;
        double sumaLavadoras = 0;

        ElectrodomesticoController electrodomesticoController = new ElectrodomesticoController();
        for (Object electroList : listaElectrodomesticos) {
            if (electroList instanceof Electrodomestico) {
               sumaElectrodomesticos += electrodomesticoController.precioFinal(((Electrodomestico) electroList).getConsumoEnergetico(), ((Electrodomestico) electroList).getPeso(), ((Electrodomestico) electroList).getPrecioBase());
            }
            if (electroList instanceof Lavarropa) {
                sumaLavadoras += electrodomesticoController.precioFinal(((Lavarropa) electroList).getConsumoEnergetico(), ((Lavarropa) electroList).getPeso(), ((Lavarropa) electroList).getPrecioBase());

            }
            if (electroList instanceof Televisor) {
                sumaTelevisiones += electrodomesticoController.precioFinal(((Televisor) electroList).getConsumoEnergetico(), ((Televisor) electroList).getPeso(), ((Televisor) electroList).getPrecioBase());
            }
        }  
        System.out.println("sumaElectrodomesticos = " + sumaElectrodomesticos);
        System.out.println("sumaLavadoras = " + sumaLavadoras);
        System.out.println("sumaTelevisiones = " + sumaTelevisiones);    
    }

}
