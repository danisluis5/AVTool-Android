package com.lorence.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("all")
public class Utils {
	public static BufferedImage updateColorOnPanel(String path, JPanel panel) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File(path));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return image;
	}
}
