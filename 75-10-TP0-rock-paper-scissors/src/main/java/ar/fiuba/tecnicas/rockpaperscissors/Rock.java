package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock implements Element {
	
	/** La clase Rock permite una única instancia, ya que durante el juego no es
	 * necesario distinguir los posibles Rock, sino saber que es de tipo Rock **/
	private static Rock instance = null; 
	
	/** Constructor protegido para evitar que se creen múltiples instancias de Rock **/
	protected Rock() {}
	
	public static Rock getInstance() {
		if (instance == null)
			instance = new Rock();
		return instance;
	}
	
	/** Implementación del método abstracto de la interfaz Element, que utiliza al Referee
	 * para decidir al elemento ganador entre Rock y el elemento pasado por parámetros **/
	public Element vs(Element element){
		return Referee.getInstance().decideWinner(element, this);
	}
}
