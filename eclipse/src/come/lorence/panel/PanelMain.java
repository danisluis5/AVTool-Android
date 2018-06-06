package come.lorence.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.JPanel;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MouseEvent;
import org.w3c.dom.views.AbstractView;

import com.lorence.utils.Utils;

@SuppressWarnings("all")
public class PanelMain extends JPanel implements IntefacePanel {

	private static PanelMain sInstance;

	public static PanelMain getInstance() {
		if (sInstance == null) {
			sInstance = new PanelMain();
		}
		return sInstance;
	}

	public void PanelMain() {
	}

	public void attachWidget() {
		this.establishPanel();
		PanelToolBar.getInstance().attachWidget();
    	this.add(PanelToolBar.getInstance(), BorderLayout.NORTH);
    	PanelWrapper.getInstance().attachWidget();
    	this.add(PanelWrapper.getInstance(), BorderLayout.CENTER);
	}

	public void establishPanel() {
		this.setLayout(new java.awt.BorderLayout(2, 1));
	}
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(Utils.updateColorOnPanel("/home/lorence/Desktop/OptimizationCode/eclipse/src/resource/image/background.jpg", this), 0, 0, this);             
    }
}
