/*
Se tienen que procesar algunos comandos para realizar el procesamiento de
notas de una Universidad. Se tiene una lista de estudiantes
Comando 1: Agregar estudiante y nota
1&nombre_estudiante&nota
Comando 2: Calcular promedio de los estudiantes en un momento
dado
Comando 3: Ordenar estudiantes agregados por nombre
Comando 4: Consultar la nota de un estudiante
4&nombre_estudiante
Comando 5: Visualizar lista de estudiantes
Comando 6: Salir
 */
public class Estudiante {
    private String nombre;
    private double nota;
    
    //Constructor de clase
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nombre + "\t" + nota;
    }
    
}
