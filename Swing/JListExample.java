package Swing;

import javax.swing.*;

public class JListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JList<String> list = new JList<>(items);
        frame.add(new JScrollPane(list));

        frame.setVisible(true);
    }
}