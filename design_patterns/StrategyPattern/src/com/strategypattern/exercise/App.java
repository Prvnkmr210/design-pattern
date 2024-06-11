package com.strategypattern.exercise;

import javax.imageio.ImageReader;

public class App {

	public static void main(String[] args) {
		ImageManager imageManager = new ImageManager();
		imageManager.setRenderer(new LaptopRenderer());
		imageManager.show();
		
		ImageManager imageManager1 = new ImageManager();
		imageManager1.setRenderer(new SmartphoneRenderer());
		imageManager1.show();

	}

}
