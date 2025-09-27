package Swing;

import javax.swing.*;

public class JButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButton Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        JButton button = new JButton("Click Me");
        frame.add(button);

        frame.setVisible(true);
    }
}