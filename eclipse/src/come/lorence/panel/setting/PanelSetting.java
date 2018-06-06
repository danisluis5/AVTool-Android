package come.lorence.panel.setting;

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
		
		
		
		GroupLayout groupLayout = new GroupLayout(PanelSetting.getInstance());
		PanelSetting.getInstance().setLayout(groupLayout);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1039, Short.MAX_VALUE)
        );
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );
	}

	public void establishPanel() {
		this.setBackground(new Color(0, 0, 0));
	}

}
