package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample {
    public static void main(String[] args) {
   
        JFrame frame = new JFrame("CardLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

    
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

     
        JPanel card1 = new JPanel();
        card1.setBackground(Color.CYAN);
        card1.add(new JLabel("This is Card 1"));

        JPanel card2 = new JPanel();
        card2.setBackground(Color.ORANGE);
        card2.add(new JLabel("This is Card 2"));

        JPanel card3 = new JPanel();
        card3.setBackground(Color.LIGHT_GRAY);
        card3.add(new JLabel("This is Card 3"));

 
        cardPanel.add(card1, "Card1");
        cardPanel.add(card2, "Card2");
        cardPanel.add(card3, "Card3");

 
        JPanel buttonPanel = new JPanel();
        JButton btn1 = new JButton("Show Card 1");
        JButton btn2 = new JButton("Show Card 2");
        JButton btn3 = new JButton("Show Card 3");

        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);

 
        btn1.addActionListener(e -> cardLayout.show(cardPanel, "Card1"));
        btn2.addActionListener(e -> cardLayout.show(cardPanel, "Card2"));
        btn3.addActionListener(e -> cardLayout.show(cardPanel, "Card3"));

        // Add panels to the frame
        frame.setLayout(new BorderLayout());
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

 
        frame.setVisible(true);
    }
}