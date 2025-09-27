package Swing;

import javax.swing.*;

public class JFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}