/*
 * Mitch Meyer
 * 3/1/2016
 * Assignment 8.2
 * Bellevue University
 * JFrameWithManyCompoents.java
 * 
 * This program has 3 bugs!
 */
package jframewithmanycomponents;
import javax.swing.*;
import java.awt.*;

public class JFrameWithManyComponents extends JFrame {
    final int FRAME_WIDTH = 300;
    final int FRAME_HEIGHT = 300;
    public JFrameWithManyComponents(){
        super("Demonstrating many components");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel heading = new JLabel("This frame has many components");
        heading.setFont(new Font("Arial", Font.BOLD, 16));
        JLabel namePrompt = new JLabel("Enter your name");
        JTextField nameField = new JTextField(12);
        JButton button = new JButton("Click to continue");
        setLayout(new FlowLayout());
        add(heading);
        add(namePrompt);
        add(nameField);
        add(button);
    }
    
    public static void main(String[] args) {
        JFrameWithManyComponents frame = new JFrameWithManyComponents();
        frame.setVisible(true);
    }
    
}
