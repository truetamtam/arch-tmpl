package com.truetamtam.quackable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by DC on 29.06.2015.
 */
public class Flock implements Quackable {

    ArrayList<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable duck) {
        quackers.add(duck);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }
}
