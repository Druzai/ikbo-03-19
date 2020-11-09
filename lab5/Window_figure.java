package ru.mirea.lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


class Window_figure extends JFrame {
    public static BufferedImage myImage;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        JFrame jf = new JFrame("Lab 5 Sosunov");
        jf.setSize(600, 600);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.setVisible(true);
        String img_str = null;
        if (sc.hasNext())
            img_str = sc.next();
        assert img_str != null;
        myImage = ImageIO.read(new File(img_str));
        JPanel jp = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(myImage, 10, 10, this);
            }
        };
        jf.add(jp);
    }
}