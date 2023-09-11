package co.yom.thecodercave.singlerseposibilityprinciple.notsrp;

public class Orden {

    private int idOrden;
    private String nombreCliente;
    private double cantidadTotal;

    public Orden(int idOrden, String nombreCliente, double cantidadTotal) {
        this.idOrden = idOrden;
        this.nombreCliente = nombreCliente;
        this.cantidadTotal = cantidadTotal;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(double cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }
}
