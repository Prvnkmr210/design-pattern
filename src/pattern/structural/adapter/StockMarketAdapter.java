package pattern.structural.adapter;

public class StockMarketAdapter implements CSVParser {

	private XMLParser xmlParser;
	
	public StockMarketAdapter(XMLParser xmlParser) {
		this.xmlParser = xmlParser;
	}
	
	@Override
	public void parseCSV() {
		xmlParser.parseXML();
	}
}
