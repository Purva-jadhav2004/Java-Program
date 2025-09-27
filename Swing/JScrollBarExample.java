package Swing;

import javax.swing.*;
import java.awt.*;

public class JScrollBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JScrollBar scrollBar = new JScrollBar(JScrollBar.VERTICAL);
        frame.add(scrollBar);

        frame.setVisible(true);
    }
}