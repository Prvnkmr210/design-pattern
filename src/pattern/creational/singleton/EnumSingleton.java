package pattern.creational.singleton;

public enum EnumSingleton {
	// To overcome the reflection, Joshua Bloch suggested to use Enum
	// But enum type is not very flexible. Doesn't support lazy initialization
    INSTANCE;
    
    public void doSomething(){
        System.out.println("Enum Singleton");
    }
}