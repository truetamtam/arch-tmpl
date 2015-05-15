package com.truetamtam;

import com.truetamtam.team.*;

/**
 * Created by truetamtam on 05.05.15.
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        GarageDoor garageDoor = new GarageDoor();
        Light kitchenLight = new Light("Light in kitchen");
        Light roomLight = new Light("Light in room");
        Stereo stereo = new Stereo();

        LightOnCommand roomLightOn = new LightOnCommand(roomLight);
        LightOffCommand roomLightOff = new LightOffCommand(roomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        StereoOnWithCdCommand stereoOnWithCd = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remote.setCommand(0, roomLightOn, roomLightOff);
        remote.setCommand(1, stereoOnWithCd, stereoOff);
        remote.setCommand(2, kitchenLightOn, kitchenLightOff);

        System.out.println(remote);

        // light on off
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        // light in kitchen
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
        // stereo
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);

    }
}
