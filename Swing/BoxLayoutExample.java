package Swing;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("BoxLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

       
        JPanel verticalPanel = new JPanel();
        verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));

   
        verticalPanel.add(new JButton("Button 1"));
        verticalPanel.add(Box.createVerticalStrut(10)); // Spacer
        verticalPanel.add(new JButton("Button 2"));
        verticalPanel.add(Box.createVerticalStrut(10));
        verticalPanel.add(new JButton("Button 3"));

        // Create a panel with horizontal BoxLayout (X_AXIS)
        JPanel horizontalPanel = new JPanel();
        horizontalPanel.setLayout(new BoxLayout(horizontalPanel, BoxLayout.X_AXIS));

        // Add labels horizontally
        horizontalPanel.add(new JLabel("Label A"));
        horizontalPanel.add(Box.createHorizontalStrut(20)); // Spacer
        horizontalPanel.add(new JLabel("Label B"));
        horizontalPanel.add(Box.createHorizontalStrut(20));
        horizontalPanel.add(new JLabel("Label C"));

        // Add both panels to the frame
        frame.setLayout(new BorderLayout());
        frame.add(verticalPanel, BorderLayout.WEST);
        frame.add(horizontalPanel, BorderLayout.SOUTH);

        // Show the frame
        frame.setVisible(true);
    }
}