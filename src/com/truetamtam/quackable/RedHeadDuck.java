package com.truetamtam.quackable;

/**
 * Created by DC on 29.06.2015.
 */
public class RedHeadDuck implements Quackable {

    Observable observable;

    public RedHeadDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        notifyObservers();
        System.out.println("Redhead quack.");
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
