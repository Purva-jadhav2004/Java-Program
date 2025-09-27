package Swing;



import java.awt.*;
import javax.swing.*;

public class ComponentExample extends Canvas {
    public void paint(Graphics g) {
        g.drawString("This is a Component (Canvas)", 20, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Component Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ComponentExample comp = new ComponentExample();
        frame.add(comp);

        frame.setVisible(true);
    }
}