package pattern.creational.singleton;

public class LazyInitializedSingleton {
	
	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton(){}

	public static LazyInitializedSingleton getInstance(){
		// Not suitable for multithreaded environment
		if(instance == null){
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}
