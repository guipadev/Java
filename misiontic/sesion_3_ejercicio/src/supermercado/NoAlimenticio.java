package supermercado;

import java.util.Date;

public class NoAlimenticio extends Producto {
    private Date fechaVenceGarantia;
    
    public NoAlimenticio(){
        super();
        fechaVenceGarantia = new Date();
    }
    
    public NoAlimenticio(Date fechaVencimiento) {
        super();
        this.fechaVenceGarantia = fechaVencimiento;
    }
    
    public NoAlimenticio(Date fechaVencimiento, int idProducto, String nombreProducto, int cantidad, int precio, String tipo) {
        this.fechaVenceGarantia = fechaVencimiento;
    }

    @Override
    public String toString() {
        return super.toString()+"\tFecha de Garantia: "+fechaVenceGarantia.toString()+"\n"; 
    }
}
