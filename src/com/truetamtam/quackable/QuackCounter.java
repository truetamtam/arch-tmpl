package com.truetamtam.quackable;

/**
 * Created by DC on 29.06.2015.
 */
public class QuackCounter implements Quackable {

    Quackable duck;

    static int quacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        this.duck.quack();
        quacks++;
    }

    public static int getQuacks() {
        return quacks;
    }
}
