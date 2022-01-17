package principle.solid.openclosed;

public class App {

	public static void main(String[] args) {
		// In future if we want to implement selection sort, it would be possible with least possible changes
		// If not for interface then even change had to be done in SortingProcessor class
		SortingProcessor sp = new SortingProcessor(new BubbleSort());
		sp.execute();

	}

}
