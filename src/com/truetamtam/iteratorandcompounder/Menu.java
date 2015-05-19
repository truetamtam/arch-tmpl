package com.truetamtam.iteratorandcompounder;

import java.util.ArrayList;
import java.util.Iterator;


public class Menu extends MenuComponent {

    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    public String name;
    public String desc;

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public void print() {
        // Menu specs
        System.out.println("\n" + getName());
        System.out.println(getDesc() + " ");
        System.out.println("-----------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
