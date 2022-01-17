package pattern.behavioral.observer;

public class App {

	public static void main(String[] args) {
		
		WeatherStation station = new WeatherStation();
		// Observer is observing any change in weather station.
		// It prints anything as soon as station data changes.
		WeatherObserver weatherObserver = new WeatherObserver(station);
		
		station.setHumidity(100);
		station.setPressure(200);
		station.setTemperature(300);
		
	}
}
