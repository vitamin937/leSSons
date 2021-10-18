package ru.geek1.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("First Window");
        setBounds(300, 300, 400, 400);
        setVisible(true);

        JButton jButton = new JButton("OK");
        JButton jButtonNew = new JButton("Cancel");
        JLabel label = new JLabel("test");

        JPanel panel = new JPanel(new GridLayout(1, 2));

        panel.add(jButton);
        panel.add(jButtonNew);

        panel.setPreferredSize(new Dimension(100, 50));
        add(panel, BorderLayout.SOUTH);
        add(label, BorderLayout.NORTH);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OK");
                label.setText("OK");
            }
        });
        jButtonNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cancel");
                label.setText("Cancel");
            }
        });
    }
}

class MainClass {
    public static void main(String[] args) {
        new MyWindow();
    }
}
