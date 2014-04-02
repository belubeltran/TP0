package ar.fiuba.tecnicas.rockpaperscissors;

public class Scissors implements Element {
	
	/** La clase Scissors permite una �nica instancia, ya que durante el juego no es
	 * necesario distinguir los posibles Scissors, sino saber que es de tipo Scissors **/
	private static Scissors instance = new Scissors(); 
	
	/** Constructor protegido para evitar que se creen m�ltiples instancias de Scissors **/
	protected Scissors() {}
	
	public static Scissors getInstance() {
		return instance;
	}

	/** Implementaci�n del m�todo abstracto de la interfaz Element, que utiliza al Referee
	 * para decidir al elemento ganador entre Scissors y el elemento pasado por 
	 * par�metros **/
	public Element vs(Element element){
		return referee.decideWinner(element, this);
	}
}
