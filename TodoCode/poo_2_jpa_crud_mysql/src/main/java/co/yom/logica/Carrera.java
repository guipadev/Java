package co.yom.logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrera implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;

    /**
     * A nivel logico de modelado de clases, NO de BD 
     * Para poder hacer una relacion debe haber una lista de objetos (Colletions)
     * Cuando la relacion es de 1 -> N esta relacion iria al lado del 1 porque:
     * En este caso tiene sentido que la carrera conozca la lista de materias que viceversa
     */
    @OneToMany (mappedBy = "carre")
    private LinkedList<Materia> listaMaterias;
    
    public Carrera() {
    }

    public Carrera(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }    

    public Carrera(int id, String nombre, LinkedList<Materia> listaMaterias) {
        this.id = id;
        this.nombre = nombre;
        this.listaMaterias = listaMaterias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(LinkedList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    
  
    
}
