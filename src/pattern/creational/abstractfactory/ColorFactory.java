package pattern.creational.abstractfactory;

public class ColorFactory implements AbstractFactory<Color>{

	@Override
	public Color create(String type) {
		if(type == ColorType.WHITE.toString())
			return new White();
		else if(type == ColorType.BLACK.toString())
			return new Black();
		return null;
	}

}
