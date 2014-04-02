package ar.fiuba.tecnicas.rockpaperscissors;

public class Paper implements Element {
	
	/** La clase Paper permite una única instancia, ya que durante el juego no es
	 * necesario distinguir los posibles Paper, sino saber que es de tipo Paper **/
	private static Paper instance = new Paper(); 
	
	/** Constructor protegido para evitar que se creen múltiples instancias de Paper **/
	protected Paper() {}
	
	public static Paper getInstance() {
		return instance;
	}
	
	/** Implementación del método abstracto de la interfaz Element, que utiliza al Referee
	 * para decidir al elemento ganador entre Paper y el elemento pasado por parámetros **/
	public Element vs(Element element){
		return referee.decideWinner(element, this);
	}
}
