package com.strategypattern.exercise;

public class ImageManager {
	 
	private ImageRenderer renderer;
	
	public void setRenderer(ImageRenderer renderer) {
		this.renderer = renderer;
	}
	
	public void show() {
		// With this implementation, we are breaking open-close SOLID principle. 
		// High level module is impacted because of the low level module change, if we add MontiorRenderer in future
		// Because of if-else, also increased cyclomatic complexity
//		if(renderer instanceof TVRenderer) {
//			TVRenderer tvRenderer = (TVRenderer) renderer;
//			tvRenderer.showImage();
//		} else if(renderer instanceof LaptopRenderer) {
//			LaptopRenderer tvRenderer = (LaptopRenderer) renderer;
//			tvRenderer.showImage();
//		} else if(renderer instanceof SmartphoneRenderer) {
//			SmartphoneRenderer tvRenderer = (SmartphoneRenderer) renderer;
//			tvRenderer.showImage();
//		}
		
		this.renderer.showImage();
		
	}
}