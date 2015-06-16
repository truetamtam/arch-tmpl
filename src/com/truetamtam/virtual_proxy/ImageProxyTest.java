package com.truetamtam.virtual_proxy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by truetamtam on 01.06.15.
 */
public class ImageProxyTest {

    ImageComponent imageComponent;
    Hashtable<String, String> ms = new Hashtable<String, String>();

    JFrame frame = new JFrame("Some images to load");
    JMenuBar menuBar;
    JMenu menu;

    public static void main(String[] args) throws Exception {
        ImageProxyTest imageProxyTest = new ImageProxyTest();
    }

    public ImageProxyTest() throws Exception {
        ms.put("Some", "http://kastrylki.ru/wa-data/public/site/data/banners/kithchenaid-plus-2chainika-tochoose-2.jpg");
        ms.put("SomeOther", "http://kastrylki.ru/wa-data/public/site/data/banners/kitchenaid-green-teapot.jpg");

        URL initialURL = new URL(ms.get("Some"));

        menu = new JMenu("My some pic");
        menuBar = new JMenuBar();
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration e = ms.keys(); e.hasMoreElements(); ) {
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);

            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageComponent.setIcon(new ImageProxy(getSomeURL(e.getActionCommand())));
                    frame.repaint();
                }
            });
        }

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    URL getSomeURL(String name) {
        try {
            return new URL(ms.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
