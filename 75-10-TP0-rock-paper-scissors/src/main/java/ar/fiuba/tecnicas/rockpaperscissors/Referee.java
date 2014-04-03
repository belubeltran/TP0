package ar.fiuba.tecnicas.rockpaperscissors;

import java.util.HashMap;
import java.util.Vector;

public class Referee {
	
	private Rules rules = new Rules();
	
	/** Tabla que contiene para cada elemento, su lista de elementos a los que les gana
	 * en una partida **/
	private static HashMap<Element,Vector<Element>> wins = new HashMap<Element,Vector<Element>>();
	
	public Referee() {
		wins.put(Rock.getInstance(), rules.getRockWins());
		wins.put(Paper.getInstance(), rules.getPaperWins());
		wins.put(Scissors.getInstance(), rules.getScissorsWins());
		wins.put(Fire.getInstance(), rules.getFireWins());
	}
	
	/** El Referee decide el elemento ganador en una partida. Lo hace a partir de la
	 * tabla wins, que construye a partir de la clase Rules. **/
	public Element decideWinner(Element elementOne, Element elementTwo) {
		if (wins.get(elementOne).contains(elementTwo)) 
			return elementOne;
		return elementTwo;
	}
}
