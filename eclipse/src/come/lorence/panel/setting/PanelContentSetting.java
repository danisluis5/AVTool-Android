package come.lorence.panel.setting;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.JPanel;

import come.lorence.panel.IntefacePanel;

@SuppressWarnings("all")
public class PanelContentSetting extends JPanel implements IntefacePanel {

	private static PanelContentSetting sInstance;

	public static PanelContentSetting getInstance() {
		if (sInstance == null) {
			sInstance = new PanelContentSetting();
		}
		return sInstance;
	}

	public void PanelContentSetting() {
		
	}
	
	public void attachWidget() {
		this.establishPanel();
		GroupLayout PanelContentSettingLayout = new GroupLayout(PanelContentSetting.getInstance());
        PanelContentSetting.getInstance().setLayout(PanelContentSettingLayout);
        PanelContentSettingLayout.setHorizontalGroup(
            PanelContentSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1039, Short.MAX_VALUE)
        );
        PanelContentSettingLayout.setVerticalGroup(
            PanelContentSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );
	}

	public void establishPanel() {
		PanelContentSetting.getInstance().setBackground(new Color(207, 132, 57));
	}

}
