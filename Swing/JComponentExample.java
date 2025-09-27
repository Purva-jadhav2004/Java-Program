package Swing;

import javax.swing.*;
import java.awt.*;

public class JComponentExample extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("This is a custom JComponent", 20, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JComponent Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponentExample comp = new JComponentExample();
        frame.add(comp);

        frame.setVisible(true);
    }
}
