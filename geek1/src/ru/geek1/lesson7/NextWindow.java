package ru.geek1.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NextWindow extends JFrame {
    WWindows wWindows;

    public NextWindow(final WWindows wWindows) {
        this.wWindows = wWindows;
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Next Window");
        setBounds(300, 300, 400, 400);
        setVisible(true);

        JButton jButtonOK = new JButton("OK");
        JButton jButtonExt = new JButton("Cancel");
        JTextField name = new JTextField("");
        JTextField surname = new JTextField("");

        JPanel panel1 = new JPanel(new GridLayout(1, 2));
        panel1.add(jButtonOK);
        panel1.add(jButtonExt);

        JPanel panel2 = new JPanel(new GridLayout(2, 1));
        panel2.add(name);
        panel2.add(surname);

        panel1.setPreferredSize(new Dimension(100, 70));
        panel2.setPreferredSize(new Dimension(100, 70));

        JPanel panel3 = new JPanel(new GridLayout(2, 1));
        panel3.add(panel2);
        panel3.add(panel1);

        add(panel3);


        jButtonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wWindows.setParams(name.getText(), surname.getText());
                            }
        });
        jButtonExt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
}

