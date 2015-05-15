package com.truetamtam.team;

/**
 * Created by truetamtam on 05.05.15.
 */
public class Stereo {

    int volume;
    String regime;

    public void on() {
        System.out.println("Stereo is on.");
    }

    public void setCd() {
        this.regime = "cd";
        System.out.println("Set stereo to cd.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Current volume is now: " + this.volume);
    }

    public void off() {
        System.out.println("Stereo off.");
    }
}

