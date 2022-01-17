package principle.solid.dependencyinversion;

// the high level module
public class DatabaseController {

	// we program to an interface - so we can achieve loosely coupled architecture
	// In future moving implementing another Database would be easy
	private Database database;
	
	public DatabaseController(Database database) {
		this.database = database;
	}
	
	public void connect() {
		this.database.connect();
	}
	
	public void disconnect() {
		this.database.disconnect();
	}
}
