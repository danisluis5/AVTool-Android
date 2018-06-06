package come.lorence.panel;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JToolBar;

@SuppressWarnings("all")
public class ToolBar extends JToolBar {
	
	private static ToolBar sInstance;
	
	public static ToolBar getInstance() {
		if (sInstance == null) {
			sInstance = new ToolBar();
		}
		return sInstance;
	}
}