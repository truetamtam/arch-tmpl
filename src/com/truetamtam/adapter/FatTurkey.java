package com.truetamtam.adapter;

/**
 * Created by truetamtam on 06.05.15.
 */
public class FatTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Fat turkey gobbles.");
    }

    @Override
    public void fly() {
        System.out.println("Fat turkey flaps it's wings.");
    }
}
