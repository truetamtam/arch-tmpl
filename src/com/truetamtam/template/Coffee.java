package com.truetamtam.template;

/**
 * Created by truetamtam on 07.05.15.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Brew coffee.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add coffee condiments.");
    }
}
