package ar.fiuba.tecnicas.rockpaperscissors;

public class Scissors implements Move {
	public Move vs(Move move){
		return move.vs(this);
	}
	public Scissors vs(Paper paper) {
		return this;
	}
	public Scissors vs(Scissors scissors) {
		return this;
	}
	public Rock vs(Rock rock) {
		return rock;
	}
}
