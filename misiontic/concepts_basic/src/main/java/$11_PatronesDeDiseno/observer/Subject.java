package $11_PatronesDeDiseno.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Patron Observador
 * Nos permite notificar, esta la mayor utilidad
 * Tenemos una tarea que puede ser observada o que tiene asociado otros objetos de otras clases
 * muchos objetos de otras clases. Y cuando en esa tarea pase algo, yo voy a tener la necesidad de
 * notificarle a todos los observadores, de hacer algo para informarle a todos los asociados
 *
 * Un observador solo puede estar pendiente de un estado/clase, no de muchos
 * puede que esa clase tenga muchos estados y cambios constatemente, se van a poder observar
 * ***/

public class Subject {

    private List<Observer> observers;
    private int state;

    public Subject() {
        state = 0;
        observers = new ArrayList<>();
    }

    //Funcion notificar cambios
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }

    public void attach(Observer observer){
        //dado un observador lo voy agregar a la lista de observadores
        observers.add(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public int getState() {
        return state;
    }

    //cuando hay un nuevo valor en el estado notifica a los observadores
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
}