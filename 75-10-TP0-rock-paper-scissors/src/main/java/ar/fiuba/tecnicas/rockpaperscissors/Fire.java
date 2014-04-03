package ar.fiuba.tecnicas.rockpaperscissors;

public class Fire implements Element {
	
	/** La clase Fire permite una única instancia, ya que durante el juego no es
	 * necesario distinguir los posibles Fire, sino saber que es de tipo Fire **/
	private static Fire instance = null; 
	
	/** Constructor protegido para evitar que se creen múltiples instancias de Fire **/
	protected Fire() {}
	
	public static Fire getInstance() {
		if (instance == null)
			instance = new Fire();
		return instance;
	}

	/** Implementación del método abstracto de la interfaz Element, que utiliza al Referee
	 * para decidir al elemento ganador entre Fire y el elemento pasado por 
	 * parámetros **/
	public Element vs(Element element){
		return Referee.getInstance().decideWinner(element, this);
	}
}
