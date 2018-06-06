package come.lorence.panel;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

@SuppressWarnings("all")
public class MenuBar extends JMenuBar {

	private static MenuBar sInstance;
	private JMenu ItemMenuFile, ItemMenuEdit, ItemMenuHelp, ItemMenuAbout;
	
	public static MenuBar getInstance() {
		if (sInstance == null) {
			sInstance = new MenuBar();
		}
		return sInstance;
	}
	
	public void attachWidget() {
		ItemMenuFile = new JMenu();
		ItemMenuEdit = new JMenu();
		ItemMenuHelp = new JMenu();
		ItemMenuAbout = new JMenu();
		
		ItemMenuFile.setText("File");
        MenuBar.getInstance().add(ItemMenuFile);

        ItemMenuEdit.setText("Edit");
        MenuBar.getInstance().add(ItemMenuEdit);

        ItemMenuHelp.setText("Help");
        MenuBar.getInstance().add(ItemMenuHelp);

        ItemMenuAbout.setText("About");
        MenuBar.getInstance().add(ItemMenuAbout);
	}
	
}
