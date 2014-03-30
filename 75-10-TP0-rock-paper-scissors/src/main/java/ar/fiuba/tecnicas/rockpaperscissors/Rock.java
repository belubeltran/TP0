package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock implements Move {
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
