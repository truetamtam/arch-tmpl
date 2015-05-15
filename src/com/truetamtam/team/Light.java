package com.truetamtam.team;

/**
 * Created by truetamtam on 30.04.15.
 */
public class Light {

            String lightName;

    public Light(String name) {
        this.lightName = name;
    }

    public void on() {
        System.out.println("Light" + lightName + " is vkl");
    }
    public void off() {
        System.out.println("Light " + lightName + "is vikluchen");
    }
}
