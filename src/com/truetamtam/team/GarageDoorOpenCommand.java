package com.truetamtam.team;

/**
 * Created by truetamtam on 05.05.15.
 */
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    /**
     * @param garageDoor
     */
    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }


    @Override
    public void execute() {
        this.garageDoor.open();
    }
}
