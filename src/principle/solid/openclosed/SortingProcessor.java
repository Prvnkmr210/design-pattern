package principle.solid.openclosed;

public class SortingProcessor {
	
	Sorting algorithm;
	
	public SortingProcessor(Sorting algorithm) {
		this.algorithm = algorithm;
	}
	
	void execute() {
		algorithm.sort();
	}

}
