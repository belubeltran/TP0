package ar.fiuba.tecnicas.rockpaperscissors;

public class Paper {
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
