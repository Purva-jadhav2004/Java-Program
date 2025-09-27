package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame {
private JTextField usernameField;
private JPasswordField passwordField;
 private JButton loginButton, resetButton;

public LoginForm() {
    setTitle("Login");
    setSize(350, 200);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLocationRelativeTo(null); 
setLayout(new GridBagLayout());
 GridBagConstraints gbc = new GridBagConstraints();
 gbc.gridx = 0;
gbc.gridy = 0;
gbc.insets = new Insets(10, 10, 5, 5);
gbc.anchor = GridBagConstraints.EAST;
add(new JLabel("Username:"), gbc);
usernameField = new JTextField(15);
gbc.gridx = 1;
gbc.anchor = GridBagConstraints.WEST;
add(usernameField, gbc);
gbc.gridx = 0;
gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Password:"), gbc);


        passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(passwordField, gbc);

   
  JPanel buttonPanel = new JPanel();
 loginButton = new JButton("Login");
 resetButton = new JButton("Reset");
        buttonPanel.add(loginButton);
        buttonPanel.add(resetButton);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(15, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER;
        add(buttonPanel, gbc);

     
        loginButton.addActionListener(e -> JOptionPane.showMessageDialog(this,
                "Login clicked\nUsername: " + usernameField.getText()));
        
        resetButton.addActionListener(e -> {
            usernameField.setText("");
            passwordField.setText("");
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }
}
