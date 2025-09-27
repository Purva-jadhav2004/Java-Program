package Swing;

import javax.swing.*;
import java.awt.*;

public class JLabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        JLabel label = new JLabel("This is a JLabel");
        frame.add(label);

        frame.setVisible(true);
    }
}