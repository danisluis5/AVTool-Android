/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimizationcode;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author lorence
 */
public class OptimizationCode {
    
    public static void main(String[] args) {
        MainScreen.getInstance().setDefaultLookAndFeelDecorated(true);
        MainScreen.getInstance().setTitle("My First Swing Application");
        MainScreen.getInstance().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Welcome");
        MainScreen.getInstance().add(label);
        MainScreen.getInstance().pack();
        MainScreen.getInstance().setVisible(true);
    }
    
}
