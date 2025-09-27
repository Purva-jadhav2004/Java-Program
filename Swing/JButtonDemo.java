package Swing;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonDemo extends JFrame implements ActionListener {

    JTextField jtf;
    JButton jb;

    public JButtonDemo() {
        setTitle("JButton Demo");
        

        jtf = new JTextField(15);
        add(jtf);

        jb = new JButton("Click Me");
        jb.addActionListener(this);
        add(jb);

        setSize(300, 150); // Increased size for better layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        jtf.setText(ae.getActionCommand());
    }

    public static void main(String[] args) {
        // Run GUI in Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new JButtonDemo());
    }
}
