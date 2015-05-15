package com.truetamtam;

import com.truetamtam.template.Coffee;
import com.truetamtam.template.Tea;

/**
 * Created by truetamtam on 07.05.15.
 */
public class CaffeineBeverageTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        tea.prepareRecipe();
        coffee.prepareRecipe();
    }
}
