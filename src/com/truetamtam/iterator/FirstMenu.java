package com.truetamtam.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by truetamtam on 07.05.15.
 */
public class FirstMenu implements WaitresWithIterator {
    public ArrayList<MenuItem> menuItems;

    public FirstMenu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;

        addItem("name1", "desc1", true, 2.99);
        addItem("name2", "desc2", true, 66.99);
        addItem("name3", "desc3", true, 3.99);
        addItem("name4", "desc4", true, 4.99);
        addItem("name5", "desc5", true, 33.99);
    }

    private void addItem(String name, String desc, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, desc, vegetarian, price));
    }

    @Override
    public FirstMenuIterator createIterator() {
        return new FirstMenuIterator(menuItems);
    }
}
