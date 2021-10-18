package ru.geek1.lesson7;

import javax.swing.*;
import java.awt.*;

public class DrowLine extends JPanel {
    public void paintComponent(Graphics g) {

        g.setColor(Color.red);
        g.drawLine(20, 20, 120, 120);

        g.setColor(Color.green);
        g.drawLine(10, 10, 120, 120);

        g.setColor(Color.blue);
        g.drawLine(0, 0, 120, 120);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame jFrame = new JFrame("Drow Line");

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setBackground(Color.CYAN);
        jFrame.setSize(500, 500);

        DrowLine drowLine = new DrowLine();
        jFrame.add(drowLine);
        jFrame.setVisible(true);

    }
}
