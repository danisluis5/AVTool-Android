package come.lorence.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.TitledBorder;

import come.lorence.panel.MenuBar;
import come.lorence.panel.PanelMain;
import come.lorence.panel.PanelToolBar;
import come.lorence.panel.PanelWrapper;
import come.lorence.panel.ToolBar;


/**
 * @author learns
 * You should use miff-checker to compare difference between two source codes.
 */

@SuppressWarnings("all")
public class MainFrame extends JFrame {

	public static MainFrame sInstance;
	private JPanel MainScreen;
    
    public static MainFrame getInstance() {
        if (sInstance == null) {
            sInstance = new MainFrame();
        }
        return sInstance;
    }
    
    public MainFrame() {
    	SetupMainFrame.getInstance().establishApplication(this);
        initComponents();
    }
    
    private void initComponents() {
    	MenuBar.getInstance().attachWidget();
    	setJMenuBar(MenuBar.getInstance());
    	
    	PanelMain.getInstance().attachWidget();
    	getContentPane().add(PanelMain.getInstance(), BorderLayout.CENTER);
    	
    	pack();
    }            
}
