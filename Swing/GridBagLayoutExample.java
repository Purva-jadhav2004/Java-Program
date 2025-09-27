+package Swing;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("GridBagLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

  
        Container container = frame.getContentPane();
        container.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

   
        JLabel label1 = new JLabel("Name:");
        JTextField textField1 = new JTextField(10);
        JLabel label2 = new JLabel("Email:");
        JTextField textField2 = new JTextField(10);
        JButton submitButton = new JButton("Submit");

     
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        container.add(label1, gbc);

      
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        container.add(textField1, gbc);

       
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        container.add(label2, gbc);

       
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        container.add(textField2, gbc);

  
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        container.add(submitButton, gbc);

    
        frame.setVisible(true);
    }
}