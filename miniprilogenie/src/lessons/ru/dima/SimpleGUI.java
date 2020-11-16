package lessons.ru.dima;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input");
    private JRadioButton rbutton1 = new JRadioButton("Select this");
    private JRadioButton rbutton2 = new JRadioButton("Select that");
    private JCheckBox chbox = new JCheckBox("Check", false);

    public SimpleGUI () {
        super("Simple Example");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        group.add(rbutton1);
        group.add(rbutton2);
        container.add(rbutton1);
        rbutton1.setSelected(true);
        container.add(rbutton2);
        container.add(chbox);
        button.addActionListener(new ButtonEventLisener ());
        container.add(button);
    }
    class   ButtonEventLisener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String message = "";
            message += "Button was pressed\n";
            message += "Text is" + input.getText() + "\n";
            message += (rbutton1.isSelected() ? "Radio #1 " : "Radio #2 ") + "is selected!" + "\n";
            message += "Checkbox is " + (chbox.isSelected() ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
