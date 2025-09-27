package Swing;

import javax.swing.*;
import java.awt.*;

public class JPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        frame.add(panel);

        frame.setVisible(true);
    }
}