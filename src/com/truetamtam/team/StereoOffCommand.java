package com.truetamtam.team;

/**
 * Created by truetamtam on 06.05.15.
 */
public class StereoOffCommand implements Command {

    public Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }


    @Override
    public void execute() {
        this.stereo.off();
    }
}
