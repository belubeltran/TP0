package ar.fiuba.tecnicas.rockpaperscissors;
import java.util.Vector;

public class Rules { 

	/** Vectores que contienen los elementos a los que les gana cada uno. **/
	private Vector<Element> rockWins = new Vector<Element>();
	private Vector<Element> paperWins = new Vector<Element>();
	private Vector<Element> scissorsWins = new Vector<Element>();
	
	private void initializeWins() {
		rockWins.add(Scissors.getInstance());
		paperWins.add(Rock.getInstance());
		scissorsWins.add(Paper.getInstance());
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
}
