package pattern.creational.abstractfactory;

public interface AbstractFactory<T> {
	
	T create(String type);

}
