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
        setVisible(false);

        JButton jButtonOK = new JButton("OK");
        JButton jButtonExt = new JButton("Cancel");
        JLabel lname = new JLabel("Введите имя:");
        JLabel lsurname = new JLabel("Введите фамилию:");
        JLabel lpatronymic = new JLabel("Введите отчество:");
        JTextField name = new JTextField("");
        JTextField surname = new JTextField("");
        JTextField patronymic = new JTextField("");

        JPanel panel1 = new JPanel(new GridLayout(1, 2));
        panel1.add(jButtonOK);
        panel1.add(jButtonExt);

        JPanel panel2 = new JPanel(new GridLayout(3, 2));
        panel2.add(lname);
        panel2.add(name);
        panel2.add(lsurname);
        panel2.add(surname);
        panel2.add(lpatronymic);
        panel2.add(patronymic);

        add(panel1, BorderLayout.SOUTH);
        add(panel2, BorderLayout.NORTH);


        jButtonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wWindows.setParams(name.getText(), surname.getText(),patronymic.getText());
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

