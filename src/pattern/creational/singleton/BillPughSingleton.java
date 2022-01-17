package pattern.creational.singleton;

public class BillPughSingleton {

	private BillPughSingleton(){}

	private static class SingletonHelper{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	// Most widely approach and suitable to use
	public static BillPughSingleton getInstance(){
		return SingletonHelper.INSTANCE;
	}
	
	void display() {
		System.out.println("Widely used Singleton implementation");
	}

}
