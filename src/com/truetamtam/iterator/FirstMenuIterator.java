package com.truetamtam.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by truetamtam on 14.05.15.
 */
public class FirstMenuIterator implements Iterator<MenuItem> {

    ArrayList<MenuItem> items;
    private int position = 0;

    public FirstMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        try {
            items.get(position);
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position += 1;
        return menuItem;
    }

    @Override
    public void remove() {

    }
}
