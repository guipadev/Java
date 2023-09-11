package co.yom.thecodercave.singlerseposibilityprinciple.notsrp;

public class Factura {

    private int idFactura;
    private double totalCompra;
    private String fechaCompra;

    public Factura() {
    }

    public Factura(int idFactura, double totalCompra, String fechaCompra) {
        this.idFactura = idFactura;
        this.totalCompra = totalCompra;
        this.fechaCompra = fechaCompra;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
