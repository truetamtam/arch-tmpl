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

}
