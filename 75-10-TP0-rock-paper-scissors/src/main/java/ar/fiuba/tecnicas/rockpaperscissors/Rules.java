package ar.fiuba.tecnicas.rockpaperscissors;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Rules extends DefaultHandler { 

	/** Vectores que contienen los elementos a los que les gana cada uno. **/
	private Vector<Element> rockWins = new Vector<Element>();
	private Vector<Element> paperWins = new Vector<Element>();
	private Vector<Element> scissorsWins = new Vector<Element>();
	private Vector<Element> fireWins = new Vector<Element>();
	
	/** Permiten la lectura del archivo de reglas **/
	String tagContent = null;
	String tagName = null;
	  
	/** A partir de un lector de XML, se guardan los elementos a los que le gana cada uno
	 * en su respectivo vector de wins **/
	private void initializeWins() {
	    SAXParserFactory parserFactor = SAXParserFactory.newInstance();
	    SAXParser parser;
		try {
			parser = parserFactor.newSAXParser();
			parser.parse(new File("rules\\rules.xml"), this);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
	
	/** Metodo que guarda en el respectivo vector pasado por parametros, el elemento
	 * al que éste le gana **/
	private void addWin(Vector<Element> wins) {
		if (tagContent.contentEquals("Rock"))
			wins.add(Rock.getInstance());
		else if (tagContent.contentEquals("Paper"))
			wins.add(Paper.getInstance());
		else if (tagContent.contentEquals("Scissors"))
			wins.add(Scissors.getInstance());
		else if (tagContent.contentEquals("Fire"))
			wins.add(Fire.getInstance());
	}
	
	@Override
	/** Este método es llamado cuando se encuentra un tag en el archivo XML de inicio **/
	public void startElement(String uri, String localName, String qName, 
			Attributes attributes) throws SAXException {
		if (qName ==  "element") {
			tagName = attributes.getValue("id");
		}
	}

	@Override
	/** Este método es llamado cuando se encuentra un tag en el archivo XML de cierre **/
	public void endElement(String uri, String localName, String qName) 
			throws SAXException {
     	if (qName == "win") {
     		if (tagName.contains("Rock")) {
     			addWin(rockWins);
     		}
     		else if (tagName.contains("Paper")){
     			addWin(paperWins);
     		}
     		else if (tagName.contains("Scissors")) {
     			addWin(scissorsWins);
     		}
     		else if (tagName.contains("Fire")) {
     			addWin(fireWins);
     		}
     	}
	}

	@Override
	public void characters(char[] ch, int start, int length) 
	        throws SAXException {
		tagContent = String.copyValueOf(ch, start, length).trim();
	}
	
	public Rules(){
		initializeWins();
	}
	
	public Vector<Element> getRockWins() {
		return rockWins;
	}
	
	public Vector<Element> getPaperWins() {
		return paperWins;
	}
	
	public Vector<Element> getScissorsWins() {
		return scissorsWins;
	}
	
	public Vector<Element> getFireWins() {
		return fireWins;
	}
}