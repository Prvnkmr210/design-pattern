package principle.solid.dependencyinversion;

// this is the abstract layer
public interface Database {
	public void connect();
	public void disconnect();
}
