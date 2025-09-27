package Swing;



import javax.swing.*;

public class JDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Parent Frame");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JDialog dialog = new JDialog(frame, "JDialog Example", true);
        dialog.setSize(300, 200);
        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);
    }
}