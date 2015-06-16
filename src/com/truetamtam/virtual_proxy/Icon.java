package com.truetamtam.virtual_proxy;

import java.awt.*;

/**
 * Created by truetamtam on 01.06.15.
 */
public interface Icon {
    int getIconWidth();
    int getIconHeight();
    void paintIcon(ImageComponent c, Graphics g, int x, int y);
}
