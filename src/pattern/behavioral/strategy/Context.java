package pattern.behavioral.strategy;

public class Context {
	// In Strategy pattern, a class behavior or its algorithm can be changed at run time
	// Here, behavior of the class is changing at runtime
	private Strategy strategy;

	public Context(Strategy strategy){
		this.strategy = strategy;
	}

	public int executeStrategy(int num1, int num2){
		return strategy.doOperation(num1, num2);
	}
}