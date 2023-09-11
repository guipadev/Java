package co.yom.thecodercave.singlerseposibilityprinciple.notsrp;

import java.io.FileWriter;
import java.io.IOException;


/**
 * Clase de Orden de Servicio
 * Tien muchas responsabilidades y rompe el principio de responsabilidad única:
 * Porque si tengo que cambiar algo en el proceso de crearFactura, cambiar algo en el envio email
 * o cambiar algo en el log, tengo que modificar la clase
 * Y esto puede crecer de forma desproporcionada
 */
public class OrdenServicio {

    /**
     * Método para guardar orden
     * @param orden
     */
    public void guardarOrden(Orden orden) {
        try {
            // Se inserta la orden, digamos a BD
            this.insertarOrden(orden);

            // Crear factura
            var factura = this.crearFactura(orden);

            // Enviar email de compra al usuario
            this.emailFactura(factura);

            // Escribir un log si sale OK
            FileWriter infoWriter = new FileWriter("c:\\InfoLog.txt");
            infoWriter.write("The order has been complete");
            infoWriter.close();

        } catch (IOException e) {
            // Escribir un log si sale MAL
            try {
                FileWriter errorWriter = new FileWriter("c:\\ErrorLog.txt");
                errorWriter.write(e.getMessage());
                errorWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


    public boolean insertarOrden(Orden orden) {
        return true;
    }

    public Factura crearFactura(Orden orden) {

        return new Factura();
    }

    public boolean emailFactura (Factura factura) {
        return true;
    }

}
