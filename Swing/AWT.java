package Swing;

import java.awt.*;
public class AWT {
AWT()
{
	Frame f=new Frame();
	Button b=new Button("click me");
	b.setBounds(30, 50,80,30);
	f.add(b);
	f.setSize(300,300);
	f.setLayout(null);
	f.setVisible(true);
}
public static void main(String[] args) {
	AWT f=new AWT();
}
}