package com.truetamtam.iteratorandcompounder;

import java.util.ArrayList;


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
        System.out.println("\n" + getName() + "\n");
        System.out.println(getDesc() + " ");
        System.out.println("-----------------------");
    }
}
