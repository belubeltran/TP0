package ar.fiuba.tecnicas.rockpaperscissors;

public interface Move {
	public abstract Move vs(Move move);
	public abstract Move vs(Paper paper);
	public abstract Move vs(Scissors scissors);
	public abstract Move vs(Rock rock);
}
