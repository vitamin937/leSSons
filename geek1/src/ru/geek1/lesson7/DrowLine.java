package ru.geek1.lesson7;

import javax.swing.*;
import java.awt.*;

public class DrowLine extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(20, 20, 120, 120);
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drow Line");
        jFrame.setSize(200, 200);
        DrowLine drowLine = new DrowLine();
        jFrame.add(drowLine);
        jFrame.setVisible(true);
    }
}
