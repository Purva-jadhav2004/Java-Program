package Swing;



import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*; 

public class JCdemo extends JFrame implements ItemListener { 

    JTextField jtf;  
    JCheckBox jcb1, jcb2; 

    public JCdemo() { 
        setTitle("Checkbox Demo");
       
        jcb1 = new JCheckBox("Swing Demos");     
        jcb1.addItemListener(this); 
        add(jcb1); 

        jcb2 = new JCheckBox("Java Demos"); 
        jcb2.addItemListener(this); 
        add(jcb2);  

        jtf = new JTextField(30);  
        jtf.setEditable(false);
        add(jtf);  

        setSize(350, 150);  
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 

    public void itemStateChanged(ItemEvent ie) { 
        String text = ""; 
        
        if (jcb1.isSelected()) 
            text += jcb1.getText() + " ";  
        
        if (jcb2.isSelected()) 
            text += jcb2.getText(); 
        
        jtf.setText(text.trim()); 
    } 

    public static void main(String[] args) { 
        SwingUtilities.invokeLater(() -> new JCdemo()); 
    } 
}
 