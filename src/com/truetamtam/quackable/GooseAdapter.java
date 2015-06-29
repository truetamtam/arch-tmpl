package com.truetamtam.quackable;

/**
 * Created by DC on 29.06.2015.
 */
public class GooseAdapter implements Quackable {

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        this.goose.honk();
    }
}
