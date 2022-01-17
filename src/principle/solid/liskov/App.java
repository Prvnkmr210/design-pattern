package principle.solid.liskov;

public class App {

	public static void main(String[] args) {
		
		Vehicle v = new PetrolCar("Toyota", 3);
		
		v.speedUp();
		v.slowDown();
		v.fuel();
		
	}
}
