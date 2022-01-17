package pattern.creational.singleton;

public class App {
	
	public static void main(String[] args) {
		EnumSingleton singleton = EnumSingleton.INSTANCE;
		singleton.doSomething();
	}

}
