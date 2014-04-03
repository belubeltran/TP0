package ar.fiuba.tecnicas.rockpaperscissors;

import java.util.HashMap;
import java.util.Vector;

/** Clase Referee: Se encarga de buscar en una tabla inicializada por Rules
 *  el resultado de una partida y devuelve el ganador de ésta **/

public class Referee {
	
	/** Referee permite una sola instancia **/
	private static Referee instance = null;
	private Rules rules = new Rules();
	
	/** Tabla que contiene para cada elemento, su lista de elementos a los que les gana
	 * en una partida **/
	private static HashMap<Element,Vector<Element>> wins = new HashMap<Element,Vector<Element>>();
	
	protected Referee() {
		wins = rules.getRules();
	}
	
	public static Referee getInstance() {
		if (instance == null)
			instance = new Referee();
		return instance;
	}
	
	/** El Referee decide el elemento ganador en una partida. Lo hace a partir de la
	 * tabla wins, que construye a partir de la clase Rules. **/
	public Element decideWinner(Element elementOne, Element elementTwo) {
		if (wins.get(elementOne).contains(elementTwo)) 
			return elementOne;
		return elementTwo;
	}
}
