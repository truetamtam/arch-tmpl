package com.truetamtam.iterator;

import java.util.Iterator;

/**
 * Created by truetamtam on 15.05.15.
 */
public class Waitress {

    FirstMenu firstMenu;
    SecondMenu secondMenu;

    public Waitress(FirstMenu firstMenu, SecondMenu secondMenu) {
        this.firstMenu = firstMenu;
        this.secondMenu = secondMenu;
    }

    public void printMenu() {

        Iterator firstMenuIterator = firstMenu.createIterator();
        Iterator secondMenuIterator = secondMenu.createIterator();
        System.out.println("--- First menu ---");
        printMenu(firstMenuIterator);
        System.out.println("--- Second menu ---");
        printMenu(secondMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = (MenuItem)iterator.next();
            System.out.println(item.getName() + ", ");
            System.out.println(item.getPrice() + " --- ");
            System.out.println(item.getDesc() + ".");
        }
    }
}
