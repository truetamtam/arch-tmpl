package com.truetamtam.iteratorandcompounder;

import java.util.Iterator;

/**
 * Created by truetamtam on 20.05.15.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
