package com.truetamtam.template;

/**
 * Created by truetamtam on 07.05.15.
 */
public abstract class CaffeineBeverage {


    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCups();
        if (customerWantCondiments()) {
            addCondiments();
        }
    }

    boolean customerWantCondiments() {
        return true;
    }

    private void boilWater() {
        System.out.println("Boiling from beverage.");
    }

    private void pourInCups() {
        System.out.println("Pouring in cups from beverage.");
    }

    protected abstract void brew();
    protected abstract void addCondiments();



}
