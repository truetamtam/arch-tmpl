package com.truetamtam.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by truetamtam on 14.05.15.
 */
public class SecondMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    private int position = 0;

    public SecondMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return !(position > items.length || items[position] == null);
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

    @Override
    public void remove() {

    }
}
