package com.truetamtam.team;

/**
 * Created by truetamtam on 05.05.15.
 */
public class StereoOnWithCdCommand implements Command {
    public Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(12);
    }
}
