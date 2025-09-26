import javax.swing.*;
import java.awt.event.*;

public class SimpleGUI {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("My First Java GUI");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Using absolute positioning for simplicity

        // Create a label
        JLabel label = new JLabel("Click the button!");
        label.setBounds(150, 50, 200, 30);
        frame.add(label);

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(150, 100, 100, 30);
        frame.add(button);

        // Add button click action
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hello from Java GUI!");
            }
        });

        // Show the frame
        frame.setVisible(true);
    }
}
