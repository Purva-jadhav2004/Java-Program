package Swing;


import javax.swing.*;
import java.awt.event.*;

public class ComboBox {
    public static void main(String[] args) {
     
        JFrame frame = new JFrame("ComboBox Example");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); 
        JLabel resultLabel = new JLabel("Programming language Selected: Java");
        resultLabel.setBounds(60, 30, 300, 30);
        frame.add(resultLabel);
        String[] languages = {"C", "C++", "C#", "Java", "PHP"};
        JComboBox<String> comboBox = new JComboBox<>(languages);
        comboBox.setSelectedItem("Java");  
        comboBox.setBounds(80, 80, 80, 25);
        frame.add(comboBox);
        JButton showButton = new JButton("Show");
        showButton.setBounds(200, 80, 80, 25);
        frame.add(showButton);
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedLang = (String) comboBox.getSelectedItem();
                resultLabel.setText("Programming language Selected: " + selectedLang);
            }
        });
        frame.setVisible(true);
    }
}