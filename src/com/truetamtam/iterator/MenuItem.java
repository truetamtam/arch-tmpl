package com.truetamtam.iterator;

/**
 * Created by truetamtam on 14.05.15.
 */
public class MenuItem {
    public String name;
    public String desc;
    public boolean vegetarian;
    public double price;

    public MenuItem(String name, String desc, boolean vegetarian, double price) {
        this.name = name;
        this.desc = desc;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
