package com.truetamtam.iteratorandcompounder;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by truetamtam on 15.05.15.
 */
public class ThirdMenu implements IMenu {

    Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();

    public ThirdMenu() {
        addItem("name3_1", "desc3", true, 3.33);
        addItem("name3_2", "desc3", true, 7.33);
        addItem("name3_3", "desc3", true, 9.33);
    }

    private void addItem(String name, String desc, boolean veg, double price) {

        MenuItem menuItem = new MenuItem(name, desc, veg, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
