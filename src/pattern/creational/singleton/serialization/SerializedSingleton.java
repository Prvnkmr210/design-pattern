package pattern.creational.singleton.serialization;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

	private static final long serialVersionUID = -7604766932017737115L;

	private SerializedSingleton(){}

	private static class SingletonHelper{
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance(){
		return SingletonHelper.instance;
	}

	// Serialization destroys the singleton pattern 
	// to make it work, provide the implementation of readResolve() method
	public Object readResolve() {
		return getInstance();
	}

}
