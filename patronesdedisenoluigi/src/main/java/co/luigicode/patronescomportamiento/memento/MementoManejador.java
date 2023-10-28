package co.luigicode.patronescomportamiento.memento;

import java.util.ArrayList;
import java.util.List;

public class MementoManejador  {

    public List<Memento> mementos = new ArrayList<>();

    private int index;

    public MementoManejador() {
        index = 0;
    }

    public void guardar(Memento memento) {
        mementos.add(memento);
    }

    public Memento undo() {
        if(mementos.isEmpty() || index == mementos.size())
            throw new IndexOutOfBoundsException("No tiene estados");

        Memento memento = mementos.get(index);
        index++;
        return memento;
    }

    public Memento redo() {
        if(mementos.isEmpty() || index == mementos.size())
            throw new IndexOutOfBoundsException("No tiene estados");

        Memento memento = mementos.get(index);
        index--;
        return memento;
    }
}
