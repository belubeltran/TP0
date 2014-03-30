package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock implements Move {
	private static Rock instance = new Rock(); 
	
	protected Rock() {}
	
	public static Rock getInstance() {
		return instance;
	}
	public Move vs(Move move){
		return move.vs(this);
	}
	public Paper vs(Paper paper) {
		return paper;
	}
	public Rock vs(Scissors scissors) {
		return this;
	}
	public Rock vs(Rock rock) {
		return rock;
	}	
}
