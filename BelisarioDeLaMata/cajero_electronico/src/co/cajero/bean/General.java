package co.cajero.bean;

import co.cajero.util.SerializarObjeto;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class General implements Serializable {

    //static es para tener variables globales (por asi decirlo)
    //Nos interesa tener la variable global de General para poder
    //acceder desde cualquier parte del programa
    public static General general = null;

    private Cajero cajero = null;
    public List<Cliente> clientes = null;

    static {
        cargarInformacion();
    }

    public static void cargarInformacion() {
        General generalTmp = SerializarObjeto.deserializarObjeto("Cajero.mauro", General.class);
        if (generalTmp == null) {//No pudo recuperar la información del archivo
            //Ya sea porque no existía el archivo o porque de cierta forma
            //estaba dañado
            ///Tenemos que crear los Datos iniciales de nuestro aplicativo
            ///Creamos la instancia del Objeto General
            generalTmp = new General();
            ///Le asignamos los clientes y el cajero
            generalTmp.clientes = crearClientes();
            generalTmp.cajero = crearCajero();
            generalTmp.cajero.setClientes(generalTmp.clientes);
            //Asignamos el objeto creado a la variable Global
            General.general = generalTmp;
        } else {
            General.general = generalTmp;
        }
    }

    static List<Cliente> crearClientes() {
        List<Cliente> clientes = new LinkedList<>();
        System.out.println("Inicio del Proceso para Creación inicial de Clientes");
        clientes = new LinkedList<>();

        Cliente cliente = new Cliente();
        cliente.setNombreCompleto("Mauricio");
        cliente.setNumeroDeCedula("1");
        cliente.setContrasena("1");
        cliente.setSaldo(10000f);
        clientes.add(cliente);

        cliente = new Cliente();
        cliente.setNombreCompleto("Belisario");
        cliente.setNumeroDeCedula("32");
        cliente.setContrasena("xxxx2");
        cliente.setSaldo(5000f);
        clientes.add(cliente);

        cliente = new Cliente();
        cliente.setNombreCompleto("Karen");
        cliente.setNumeroDeCedula("9");
        cliente.setContrasena("9");
        cliente.setSaldo(20000f);
        clientes.add(cliente);
        System.out.println("Se terminó el proceso de la creación de los clientes");
        return clientes;
    }

    private static Cajero crearCajero() {
        Cajero cajero = new Cajero();
        return cajero;
    }

    public Cajero getCajero() {
        return cajero;
    }
    
    public void guardar(){
        SerializarObjeto.serializarObjeto("Cajero.mauro", this);
    }
}
