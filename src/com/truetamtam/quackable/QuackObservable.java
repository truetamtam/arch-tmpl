package com.truetamtam.quackable;

/**
 * Created by DC on 30.06.2015.
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
