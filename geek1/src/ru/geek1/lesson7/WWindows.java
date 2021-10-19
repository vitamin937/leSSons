package ru.geek1.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WWindows extends JFrame {
    public WWindows() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("First Window");
        setBounds(300, 300, 400, 400);
        setVisible(true);

        JButton jButton = new JButton("OK");
        JButton jButtonNew = new JButton("Cancel");
        JLabel label1 = new JLabel("");
        JLabel label2 = new JLabel("");

        JPanel panel1 = new JPanel(new GridLayout(1, 2));
        panel1.add(jButton);
        panel1.add(jButtonNew);

        JPanel panel2 = new JPanel(new GridLayout(2, 1));
        panel2.add(label1);
        panel2.add(label2);

        panel1.setPreferredSize(new Dimension(100, 70));
        panel2.setPreferredSize(new Dimension(100, 70));

        JPanel panel3 = new JPanel(new GridLayout(2, 1));
        panel3.add(panel2);
        panel3.add(panel1);

        add(panel3);


        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NextWindow();
            }
        });
        jButtonNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}

class MainWClass {
    public static void main(String[] args) {
        new WWindows();
    }
}
