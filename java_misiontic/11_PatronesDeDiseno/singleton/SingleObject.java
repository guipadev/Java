package PatronesDeDiseno.singleton;

/***
 * Patron Singleton
 * Nos permite obtener solo un objeto de una clase
 * Por ejemplo un super usuario / un solo alcalde en una ciudad
 * La clase posee un constructor privado
 * nunca se puede crear un objeto de esa clase
 * se podria realizar pero dentro de la misma clase
 * **/

public class SingleObject {

    private String nombre;

    private static SingleObject singleObject;

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        if(singleObject == null){
            singleObject = new SingleObject();
        }
        return singleObject;
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static SingleObject getSingleObject() {
        return singleObject;
    }

    public static void setSingleObject(SingleObject singleObject) {
        SingleObject.singleObject = singleObject;
    }


}
