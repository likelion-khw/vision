package com.khw.vision;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class ColorClass {
	static HashMap<String, Integer> colormap = new HashMap<String, Integer>();;
	
	public static void main(String[] args) {
		BufferedImage image = loadImage(args[0]);

		int x = image.getWidth(null);

		int y = image.getHeight(null);

		Color color = new Color(image.getRGB(x - 1, y - 1)); // ÁÂÇ¥ ¼±ÅÃ
		
		int red = color.getRed();

		int blue = color.getBlue();

		int green = color.getGreen();
		
		colormap.put("red", red);
		colormap.put("blue", blue);
		colormap.put("green", green);
		
	}

	public static BufferedImage loadImage(String url) {

		BufferedImage image = null;

		try {

			image = ImageIO.read(new File(url));

		} catch (IOException e) {

			e.printStackTrace();

		}

		return image;

	}

}