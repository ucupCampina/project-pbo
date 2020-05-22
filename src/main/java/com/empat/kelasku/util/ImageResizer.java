package com.empat.kelasku.util;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class ImageResizer {

    public static ImageIcon resizeIcon(URL url, int width, int height) {
        ImageIcon imageIcon = new ImageIcon(url);
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        return imageIcon;
    }
}
