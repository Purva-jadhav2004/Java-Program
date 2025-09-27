package Swing;

import javax.swing.*;

public class JTextAreaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextArea textArea = new JTextArea("Editable text area", 5, 20);
        frame.add(new JScrollPane(textArea));

        frame.setVisible(true);
    }
}