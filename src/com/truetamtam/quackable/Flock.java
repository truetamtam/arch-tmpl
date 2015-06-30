package com.truetamtam.quackable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by DC on 29.06.2015.
 */
public class Flock implements Quackable {

    Observable observable;
    ArrayList<Quackable> quackers = new ArrayList<Quackable>();

    public Flock() {
        this.observable = new Observable(this);
    }

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

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable)iterator.next();
            duck.registerObserver(observer);
        }
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
    }
}
