/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.config;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import utilize.Constant;

/**
 *
 * @author lorence
 */
public class AVConfiguration {
    
    private static void configureApp(JFrame jframe) {
        jframe.setTitle(Constant.TITLE);
        jframe.setLocationRelativeTo(jframe);
        jframe.setIconImage((new ImageIcon(getClass().getResource(Constant.UTILIZE_IMAGE))).getImage());
    }
}
