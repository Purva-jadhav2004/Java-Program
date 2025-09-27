package Swing;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Set GridLayout with 3 rows and 2 columns
        frame.setLayout(new GridLayout(3, 2, 10, 10)); // rows, cols, hgap, vgap

        // Add buttons to the grid
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));

        // Make the frame visible
        frame.setVisible(true);
    }
}