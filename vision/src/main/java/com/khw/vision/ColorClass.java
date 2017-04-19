package com.khw.vision;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class ColorClass {
	
	private static ColorVO colorvo;
	
	public static ColorVO run(String path, int store_code) {
		BufferedImage image = loadImage(path);

		int x = image.getWidth(null);

		int y = image.getHeight(null);

		Color color = new Color(image.getRGB(x - 1, y - 1)); // ÁÂÇ¥ ¼±ÅÃ
		
		colorvo = new ColorVO();
		
		colorvo.setStore_code(store_code);
		
		colorvo.setRed(color.getRed());

		colorvo.setBlue(color.getBlue());

		colorvo.setGreen(color.getGreen());

		
		return colorvo;
		
	}
	
	public static ColorVO run2(String path) {
		BufferedImage image = loadImage(path);

		int x = image.getWidth(null);

		int y = image.getHeight(null);

		Color color = new Color(image.getRGB(x - 1, y - 1)); // ÁÂÇ¥ ¼±ÅÃ
		
		colorvo = new ColorVO();
		
		colorvo.setRed(color.getRed());

		colorvo.setBlue(color.getBlue());

		colorvo.setGreen(color.getGreen());

		
		return colorvo;
		
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