package Swing;

import javax.swing.*;

public class JMenuBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JMenuBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("Open");
        menu.add(menuItem);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}