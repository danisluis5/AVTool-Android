package come.lorence.panel.setting;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import come.lorence.panel.IntefacePanel;

@SuppressWarnings("all")
public class PanelSetting extends JPanel implements IntefacePanel {

	private static PanelSetting sInstance;

	public static PanelSetting getInstance() {
		if (sInstance == null) {
			sInstance = new PanelSetting();
		}
		return sInstance;
	}

	public void PanelSetting() {
		
	}

	public void attachWidget() {
		this.establishPanel();
		PanelTopSetting.getInstance().attachWidget();
		PanelSetting.getInstance().add(PanelTopSetting.getInstance(), BorderLayout.PAGE_START);
		
		PanelContentSetting.getInstance().attachWidget();
		PanelSetting.getInstance().add(PanelContentSetting.getInstance(), BorderLayout.CENTER);
	}

	public void establishPanel() {
		this.setBackground(new Color(0, 0, 0));
		this.setLayout(new BorderLayout());
	}

}
