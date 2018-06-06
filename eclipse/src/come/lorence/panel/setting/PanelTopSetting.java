package come.lorence.panel.setting;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.JPanel;

import come.lorence.panel.IntefacePanel;

@SuppressWarnings("all")
public class PanelTopSetting extends JPanel implements IntefacePanel {

	private static PanelTopSetting sInstance;

	public static PanelTopSetting getInstance() {
		if (sInstance == null) {
			sInstance = new PanelTopSetting();
		}
		return sInstance;
	}

	public void PanelTopSetting() {
		
	}
	
	public void attachWidget() {
		this.establishPanel();
		GroupLayout PanelTopSettingLayout = new GroupLayout(PanelTopSetting.getInstance());
        PanelTopSetting.getInstance().setLayout(PanelTopSettingLayout);
        PanelTopSettingLayout.setHorizontalGroup(
            PanelTopSettingLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelTopSettingLayout.setVerticalGroup(
            PanelTopSettingLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
	}

	public void establishPanel() {
		this.setBackground(new Color(255, 255, 255));
	}

}
