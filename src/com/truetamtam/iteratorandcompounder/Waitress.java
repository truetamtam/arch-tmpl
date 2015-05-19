package com.truetamtam.iteratorandcompounder;

import java.util.Iterator;

/**
 * Created by truetamtam on 15.05.15.
 */
public class Waitress {

    IMenu firstIMenu;
    IMenu secondIMenu;
    IMenu thirdIMenu;

    public Waitress(IMenu firstIMenu, IMenu secondIMenu, IMenu thirdIMenu) {
        this.firstIMenu = firstIMenu;
        this.secondIMenu = secondIMenu;
        this.thirdIMenu = thirdIMenu;
    }

    public void printMenu() {

        Iterator firstMenuIterator = firstIMenu.createIterator();
        Iterator secondMenuIterator = secondIMenu.createIterator();
        Iterator thirdMenuIterator = thirdIMenu.createIterator();

        System.out.println("--- First menu ---");
        printMenu(firstMenuIterator);
        System.out.println("--- Second menu ---");
        printMenu(secondMenuIterator);
        System.out.println("--- Third menu ---");
        printMenu(thirdMenuIterator);
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
