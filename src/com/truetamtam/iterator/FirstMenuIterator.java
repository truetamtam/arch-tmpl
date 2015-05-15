package com.truetamtam.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by truetamtam on 14.05.15.
 */
public class FirstMenuIterator implements Iterator<MenuItem> {

    ArrayList<MenuItem> items;

    public FirstMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return !items.isEmpty();
    }

    @Override
    public MenuItem next() {
        return items.get(items.size() - 1);
    }

    @Override
    public void remove() {

    }
}
