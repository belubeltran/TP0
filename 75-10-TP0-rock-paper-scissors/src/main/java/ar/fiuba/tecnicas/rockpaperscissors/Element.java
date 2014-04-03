package ar.fiuba.tecnicas.rockpaperscissors;

public interface Element {
	
	/** M�todo que devuelve el elemento ganador en una partida de Rock, Paper, Scissors.
	 * Debe utilizar al Referee como �rbitro para decidir el elemento ganador.**/
	public abstract Element vs(Element element);
}