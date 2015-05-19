package com.truetamtam.iteratorandcompounder;

/**
 * Created by truetamtam on 14.05.15.
 */
public class SecondMenu extends MenuComponent {

    static final int MAX_ITEMS = 6;
    public MenuItem[] menuItems;
    public int itemsCount = 0;

    public SecondMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];

        addItem("Second name1", "Second desc1", true, 21.99);
        addItem("Second name2", "Second desc2", true, 16.99);
        addItem("Second name3", "Second desc3", true, 22.99);
        addItem("Second name4", "Second desc4", true, 5.99);
        addItem("Second name5", "Second desc5", true, 7.99);

    }

    private void addItem(String name, String desc, boolean veg, double price) {

        MenuItem menuItem = new MenuItem(name, desc, veg, price);

        if (itemsCount > MAX_ITEMS) {
            System.out.println("Max items in second menu");
        } else {
            menuItems[itemsCount] = menuItem;
            itemsCount += 1;
        }
    }

//    public SecondMenuIterator createIterator() {
//        return new SecondMenuIterator(menuItems);
//    }

}
