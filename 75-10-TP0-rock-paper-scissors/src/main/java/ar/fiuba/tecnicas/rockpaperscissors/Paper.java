package ar.fiuba.tecnicas.rockpaperscissors;

public class Paper implements Element {
	
	/** La clase Paper permite una �nica instancia, ya que durante el juego no es
	 * necesario distinguir los posibles Paper, sino saber que es de tipo Paper **/
	private static Paper instance = new Paper(); 
	
	/** Constructor protegido para evitar que se creen m�ltiples instancias de Paper **/
	protected Paper() {}
	
	public static Paper getInstance() {
		return instance;
	}
	
	/** Implementaci�n del m�todo abstracto de la interfaz Element, que utiliza al Referee
	 * para decidir al elemento ganador entre Paper y el elemento pasado por par�metros **/
	public Element vs(Element element){
		return referee.decideWinner(element, this);
	}
}
