package come.lorence.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.GroupLayout;
import javax.swing.JPanel;

import come.lorence.panel.setting.PanelSetting;

@SuppressWarnings("all")
public class PanelWrapper extends JPanel implements IntefacePanel {

	private static PanelWrapper sInstance;
	
	public static PanelWrapper getInstance() {
		if (sInstance == null) {
			sInstance = new PanelWrapper();
		}
		return sInstance;
	}
	
	public void PanelWrapper() {
	
	}
	
	public void attachWidget() {
		PanelWrapper.getInstance().establishPanel();
		PanelWrapper.getInstance().setLayout(new BorderLayout());
	}

	public void establishPanel() {
		this.setBackground(new Color(255, 255, 255));
		this.setLayout(new BorderLayout());
	}
	
}
