package ru.geek1.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WWindows extends JFrame {
    NextWindow nextWindow;
    JLabel jname;
    JLabel jsurname;
    JLabel jpatronymic;

    public WWindows() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("First Window");
        setBounds(300, 300, 400, 400);
        setVisible(true);

        JButton jButton = new JButton("OK");
        JButton jButtonNew = new JButton("Cancel");
        jname = new JLabel("");
        jsurname = new JLabel("");
        jpatronymic = new JLabel("");
        JLabel name = new JLabel("Имя:");
        JLabel surname = new JLabel("Фамилия:");
        JLabel patronymic = new JLabel("Отчество:");


        JPanel panel1 = new JPanel(new GridLayout(1, 2));
        panel1.add(jButton);
        panel1.add(jButtonNew);

        JPanel panel2 = new JPanel(new GridLayout(3, 2));
        panel2.add(name);
        panel2.add(jname);
        panel2.add(surname);
        panel2.add(jsurname);
        panel2.add(patronymic);
        panel2.add(jpatronymic);

        add(panel1, BorderLayout.SOUTH);
        add(panel2, BorderLayout.NORTH);


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
    void setParams(String name,String surname,String patronymic){
        jname.setText(name);
        jsurname.setText(surname);
        jpatronymic.setText(patronymic);
    }
}


class MainWClass {
    public static void main(String[] args) {
        new WWindows();
    }
}
