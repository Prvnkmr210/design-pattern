package pattern.structural.adapter;

public class StockMarketDataParser implements XMLParser{
	
	@Override
	public void parseXML() {
		System.out.println("Parsing stock market related XML file...");
	}
}
