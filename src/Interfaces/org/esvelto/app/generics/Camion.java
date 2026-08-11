package Interfaces.org.esvelto.app.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T>{

    private final List<T> items;
    private final int maxElementos;

    public Camion(int maxElementos) {
        this.maxElementos = maxElementos;
        this.items = new ArrayList<>();
    }

    public void addItems(List<T> items) {
        if (this.items.size() < maxElementos) {
            this.items.addAll(items);
        } else {
            throw new RuntimeException("no hay más espacio");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.items.iterator();
    }
}
