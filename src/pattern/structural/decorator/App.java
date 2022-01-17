package pattern.structural.decorator;

public class App {

	public static void main(String[] args) {
		
		Beverage milkWith2Sugars = new Sugar(new Sugar(new Milk(new PlainBeverage())));
		
		System.out.println(milkWith2Sugars.getDescription());
		System.out.println(milkWith2Sugars.getCost());
		
		
	}
}
