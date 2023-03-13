package supermercado;

import java.util.Date;
import java.util.logging.Logger;

public class Alimenticio extends Producto {
    
    private Date fechaVencimiento;
    
    public Alimenticio(){
        super();
        fechaVencimiento = new Date();
    }
    
    public Alimenticio(Date fechaVencimiento) {
        super();
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public Alimenticio(Date fechaVencimiento, int idProducto, String nombreProducto, int cantidad, int precio, String tipo) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return super.toString()+"\tFecha de Vencimiento: "+fechaVencimiento.toString()+"\n"; 
    }
    
    
}
