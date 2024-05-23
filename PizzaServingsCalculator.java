/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzaservingscalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author vrajp
 */

public class PizzaServingsCalculator extends JFrame{
    private final Frame frame_;
    private final JPanel line2 = new JPanel();
    double size;
    double servings;
    PizzaServingsCalculator() {
        frame_ = new JFrame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel name = new JLabel("Pizza Servings Calculator", SwingConstants.CENTER);
        name.setForeground(Color.RED);
        name.setFont(new Font("Serif", Font.BOLD, 24));
        JLabel input = new JLabel("Enter the size of the pizza in inches: ");
        line2.add(input);
        final JTextField textField = new JTextField(4);
        line2.add(textField);
        JButton method = new JButton("Calculate Servings");
        final JLabel new_label = new JLabel("", SwingConstants.CENTER);
        method.addActionListener((ActionEvent e) -> {
        size = Double.parseDouble(textField.getText());
            servings = Math.pow((size / 8), 2);
            new_label.setText("A " + size + " inch pizza will serve " + servings + " people");
        });

        frame_.add(name);
        frame_.add(line2);
        frame_.add(method);
        frame_.add(new_label);
        frame_.setLayout(new GridLayout(4, 1));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_.setSize(350, 300);
        frame_.setTitle("Pizza Servings Calculator");
        frame_.setVisible(true);
    }


        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new PizzaServingsCalculator();
    }

 }
    
