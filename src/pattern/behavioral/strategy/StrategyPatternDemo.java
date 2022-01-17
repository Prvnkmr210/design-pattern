package pattern.behavioral.strategy;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		// Here, context object behavior is varying based on its strategy object .
		// strategy object changes the algorithm here.
		Context context = new Context(new OperationAdd());		
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubstract());		
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());		
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
