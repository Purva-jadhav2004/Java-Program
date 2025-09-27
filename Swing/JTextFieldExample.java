package Swing;

import javax.swing.*;

public class JTextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        JTextField textField = new JTextField("Editable text field", 20);
        frame.add(textField);

        frame.setVisible(true);
    }
}