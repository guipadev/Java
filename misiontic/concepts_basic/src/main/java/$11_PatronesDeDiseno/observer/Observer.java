package $11_PatronesDeDiseno.observer;

//Clase que va a simular los observadores

public class Observer {

    protected Subject subject;

    //Atributo
    private String nombre;

    //Constructor
    public Observer(String nombre, Subject subject) {
        this.nombre = nombre;
        this.subject = subject;
        this.subject.attach(this);
    }

    //metodo cambio estado/notificar
    public void update(){
        System.out.println(nombre +" fue notificado del cambio de estado a " + subject.getState());
    }
}
