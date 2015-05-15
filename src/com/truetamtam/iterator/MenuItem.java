package com.truetamtam.iterator;

/**
 * Created by truetamtam on 14.05.15.
 */
public class MenuItem {
    private final String name;
    private final String desc;
    private final boolean vegetarian;
    private final double price;

    public MenuItem(String name, String desc, boolean vegetarian, double price) {

        this.name = name;
        this.desc = desc;
        this.vegetarian = vegetarian;
        this.price = price;
    }
}
