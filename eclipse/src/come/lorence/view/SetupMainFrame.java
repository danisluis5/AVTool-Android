package come.lorence.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class SetupMainFrame {
	
	public static SetupMainFrame sInstance;
	
	public static SetupMainFrame getInstance() {
		if (sInstance == null) {
			sInstance = new SetupMainFrame();
		}
		return sInstance;
	}
	
	public void establishApplication(JFrame frame) {
		// Establish close form 
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		// Establish title of application
		frame.setTitle("Optimization Android App");
		// Establish default background 
		frame.getContentPane().setBackground(new Color(255,255,255));
		// Establish type of layout
		frame.getContentPane().setLayout(new BorderLayout(1, 1));
		// Android Logo
        ImageIcon img = new ImageIcon("/home/lorence/Desktop/OptimizationCode/eclipse/src/resource/image/android.png");
        frame.setIconImage(img.getImage());
		
		// Establish minimum size of frame and the location is show center of screen
        frame.setMinimumSize(new Dimension(1200, 780));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
	}
}
