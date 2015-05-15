package com.truetamtam.team;

/**
 * Created by truetamtam on 30.04.15.
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
