package com.truetamtam;

import com.truetamtam.iteratorandcompounder.Menu;
import com.truetamtam.iteratorandcompounder.MenuComponent;
import com.truetamtam.iteratorandcompounder.MenuItem;
import com.truetamtam.iteratorandcompounder.Waitress;

/**
 * Created by truetamtam on 15.05.15.
 */
public class IteratorCompoundTest {
    public static void main(String[] args) {

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus are stored in one menu.");

        MenuComponent firstMenu = new Menu("First menu", "First menu to print.");
        MenuComponent secondMenu = new Menu("Second menu", "Second menu to print.");
        MenuComponent underMenu = new Menu("Under menu", "Under menu. Wow. Compounded.");

        firstMenu.add(new MenuItem("name1", "desc1", true, 2.99));
        firstMenu.add(new MenuItem("name2", "desc2", false, 66.99));
        firstMenu.add(new MenuItem("name3", "desc3", true, 3.99));
        firstMenu.add(new MenuItem("name4", "desc4", true, 4.99));
        firstMenu.add(new MenuItem("name5", "desc5", true, 33.99));

        secondMenu.add(new MenuItem("name1", "desc1", true, 2.99));
        secondMenu.add(new MenuItem("name2", "desc2", false, 66.99));
        secondMenu.add(new MenuItem("name3", "desc3", true, 3.99));

        secondMenu.add(underMenu);

        underMenu.add(new MenuItem("name1", "desc1", true, 2.99));
        underMenu.add(new MenuItem("name2", "desc2", false, 66.99));

        allMenus.add(firstMenu);
        allMenus.add(secondMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
