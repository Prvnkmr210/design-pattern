package pattern.creational.factory;

import pattern.creational.abstractfactory.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal>{
	
	@Override
	public Animal create(String type) {
		
		if(type == AnimalType.CAT.toString()) {
			return new Cat();
		} else if(type == AnimalType.DOG.toString()) {
			return new Dog();
		} else if(type == AnimalType.LION.toString()) {
			return new Lion();
		} else if(type == AnimalType.TIGER.toString()) {
			return new Tiger();
		}
		
		return null;
	}
}
