package com.truetamtam.adapter;

/**
 * Created by truetamtam on 06.05.15.
 */
public class JusDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Just duck quacks.");
    }

    @Override
    public void fly() {
        System.out.println("Just duck flying.");
    }
}
