package com.truetamtam;

import com.truetamtam.template.Duck;

import java.util.Arrays;

/**
 * Created by truetamtam on 07.05.15.
 */
public class SortDucks {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Duck 1", 5),
                new Duck("Duck 2", 7),
                new Duck("Tiny duck", 1),
                new Duck("Fat duck", 9)};

        System.out.println("Before sort:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("After sort:");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
