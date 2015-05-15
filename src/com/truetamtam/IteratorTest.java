package com.truetamtam;

import com.truetamtam.iterator.FirstMenu;
import com.truetamtam.iterator.SecondMenu;
import com.truetamtam.iterator.Waitress;

/**
 * Created by truetamtam on 15.05.15.
 */
public class IteratorTest {

    public static void main(String[] args) {

        FirstMenu firstMenu = new FirstMenu();
        SecondMenu secondMenu = new SecondMenu();

        Waitress waitress = new Waitress(firstMenu, secondMenu);
        waitress.printMenu();
    }
}
