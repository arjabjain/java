import javax.swing.*;

public class swing {
    public static void main(String[] args) {
        // Create frame (window)
        JFrame frame = new JFrame("My First Swing Program");

        // Create label
        JLabel label = new JLabel("Hello, Welcome to Java Swing!");
        label.setBounds(50, 50, 250, 30);

        // Add label to frame
        frame.add(label);

        // Set frame size
        frame.setSize(400, 300);

        // Layout (null means manual positioning)
        frame.setLayout(null);

        // Make frame visible
        frame.setVisible(true);

        // Close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
