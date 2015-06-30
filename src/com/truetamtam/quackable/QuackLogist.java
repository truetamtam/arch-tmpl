package com.truetamtam.quackable;

/**
 * Created by DC on 30.06.2015.
 */
public class QuackLogist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Hey quacklogist: " + duck.getClass().getName() + " just quacked!");
    }

    public String toString() {
        return "Quackologist";
    }

}
