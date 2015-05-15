package com.truetamtam.team;

/**
 * Created by truetamtam on 30.04.15.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
