package pattern.creational.factory;

import pattern.creational.abstractfactory.AbstractFactory;
import pattern.creational.abstractfactory.Color;
import pattern.creational.abstractfactory.ColorFactory;
import pattern.creational.abstractfactory.ColorType;

public class App {

	public static void main(String[] args) {
		
		AbstractFactory<Animal> animalFactory = new AnimalFactory();
		
		Animal animal = animalFactory.create(AnimalType.LION.toString());
		animal.eat();
		
		AbstractFactory<Color> colorFactory = new ColorFactory();
		Color color = colorFactory.create(ColorType.WHITE.toString());
		color.getColor();
	}
}
