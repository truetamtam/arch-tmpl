package com.truetamtam.template;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by truetamtam on 07.05.15.
 */
public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Brewing tea.");
    }


    @Override
    protected void addCondiments() {
        System.out.println("Add tea condiments.");
    }


    protected boolean customerWantCondiments() {

        String input = getUserInput();

        return input.startsWith("y");
    }


    private String getUserInput() {

        String answer = null;

        System.out.println("Some sugar?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        return answer;
    }
}
