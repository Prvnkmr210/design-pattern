package pattern.creational.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton(){}

	// decreases the performance
	public static ThreadSafeSingleton getInstance(){
		if(instance == null){
	        synchronized (ThreadSafeSingleton.class) {
	            if(instance == null){
	                instance = new ThreadSafeSingleton();
	            }
	        }
	    }
		return instance;
	}

}
