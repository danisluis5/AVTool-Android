package come.lorence.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import come.lorence.panel.setting.PanelSetting;
import come.lorence.view.MainFrame;

@SuppressWarnings("all")
public class PanelToolBar extends JPanel implements IntefacePanel {

	private static PanelToolBar sInstance;
	
	private JLabel lbSetting;
	private JLabel lbButterknife;

	public static PanelToolBar getInstance() {
		if (sInstance == null) {
			sInstance = new PanelToolBar();
		}
		return sInstance;
	}

	public void PanelToolBar() {
	}
	
	public void attachWidget() {
		PanelToolBar.getInstance().establishPanel();
		
		lbSetting = new JLabel();
		lbButterknife = new JLabel();
		
		lbSetting.setIcon(new ImageIcon("/home/lorence/Desktop/OptimizationCode/eclipse/src/resource/image/ic_setting.png")); 
		lbSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                lbSettingMousePressed(evt);
            }
        });
		
		lbButterknife.setIcon(new ImageIcon("/home/lorence/Desktop/OptimizationCode/eclipse/src/resource/image/ic_butterknife.png"));
		lbButterknife.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, new java.awt.Color(255, 255, 255)));
		
		ToolBar.getInstance().setRollover(true);
		ToolBar.getInstance().setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new Color(255, 255, 255)));
        ToolBar.getInstance().add(lbSetting);
        ToolBar.getInstance().add(lbButterknife);
        
        PanelToolBar.getInstance().add(ToolBar.getInstance(), BorderLayout.CENTER);
	}

	public void establishPanel() {
		this.setBackground(new Color(255, 255, 255));
		this.setLayout(new BorderLayout());
	}
	
	private void lbSettingMousePressed(MouseEvent evt) {
		PanelSetting.getInstance().attachWidget();
        PanelWrapper.getInstance().add(PanelSetting.getInstance(), BorderLayout.CENTER);
        PanelWrapper.getInstance().validate();
        PanelWrapper.getInstance().repaint();
    }  
}
