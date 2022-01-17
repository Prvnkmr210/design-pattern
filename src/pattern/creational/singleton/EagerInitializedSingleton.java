package pattern.creational.singleton;

public class EagerInitializedSingleton {
	
private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    // Disadvantage: Object is created and there even if the getInstance is never called.
    // Memory wastage
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

}
