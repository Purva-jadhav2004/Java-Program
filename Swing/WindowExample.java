package Swing;



import java.awt.*;

public class WindowExample {
    public static void main(String[] args) {
        Frame window = new Frame("Window Example");
        window.setSize(300, 200);
        window.setVisible(true);

        window.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                window.dispose();
            }
        });
    }
}