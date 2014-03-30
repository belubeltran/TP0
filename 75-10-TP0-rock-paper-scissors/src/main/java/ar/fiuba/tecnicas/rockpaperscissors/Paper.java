package ar.fiuba.tecnicas.rockpaperscissors;

public class Paper implements Move {
	private static Paper instance = new Paper(); 
	
	protected Paper() {}
	
	public static Paper getInstance() {
		return instance;
	}
	public Move vs(Move move){
		return move.vs(this);
	}
	public Paper vs(Paper paper) {
		return paper;
	}
	public Scissors vs(Scissors scissors) {
		return scissors;
	}
	public Paper vs(Rock rock) {
		return this;
	}
}
