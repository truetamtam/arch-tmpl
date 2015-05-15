package com.truetamtam;

import javax.swing.*;
import java.awt.*;

/**
 * Created by truetamtam on 07.05.15.
 */
public class TFrame extends JFrame {

    public static void main(String[] args) {
        TFrame myFrame = new TFrame("Some title here.");
    }

    public TFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        String message = "Cool works.";
        graphics.drawString(message, 100, 100);
    }
}
