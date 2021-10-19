package ru.geek1.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WWindows extends JFrame {
    NextWindow nextWindow;
    JLabel label1;
    JLabel label2;

    public WWindows() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("First Window");
        setBounds(300, 300, 400, 400);
        setVisible(true);

        JButton jButton = new JButton("OK");
        JButton jButtonNew = new JButton("Cancel");
        label1 = new JLabel("");
        label2 = new JLabel("");

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

        nextWindow = new NextWindow(this);
        nextWindow.setVisible(false);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextWindow.setVisible(true);
            }
        });
        jButtonNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
    void setParams(String name,String surname){
        label1.setText(name);
        label2.setText(surname);
    }
}


class MainWClass {
    public static void main(String[] args) {
        new WWindows();
    }
}
