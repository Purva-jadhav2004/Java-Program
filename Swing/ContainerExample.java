package Swing;



import javax.swing.*;
import java.awt.*;

public class ContainerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Container Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane(); // JFrame's container
        
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        container.add(button1);
        container.add(button2);

        frame.setVisible(true);
    }
}