package co.luigicode.patronescomportamiento.iterator;

public interface ItemIterator {
    boolean hasNext();
    Item next();
    void reset();
}