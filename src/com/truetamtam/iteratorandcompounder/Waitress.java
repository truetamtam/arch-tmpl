package com.truetamtam.iteratorandcompounder;

import java.util.Iterator;

/**
 * Created by truetamtam on 15.05.15.
 */
public class Waitress {

    MenuComponent menus;

    public Waitress(MenuComponent menus) {
        this.menus = menus;
    }

    public void printMenu() {
        menus.print();
    }

    public void printVegetarianMenu() {
        Iterator menusIterator = menus.createIterator();

        System.out.println("Vegan menu.");
        while (menusIterator.hasNext()) {

            MenuComponent menuComponent = (MenuComponent) menusIterator.next();

            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException ignored) {}
        }
    }

}
