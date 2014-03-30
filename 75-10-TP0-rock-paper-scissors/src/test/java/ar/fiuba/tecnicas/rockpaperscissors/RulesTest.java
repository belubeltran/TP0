package ar.fiuba.tecnicas.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RulesTest {

    private Move rock = Rock.getInstance();
    private Move paper = Paper.getInstance();
    private Move scissors = Scissors.getInstance();

    @Test
    public void rockBeatsScissors() {
        assertEquals(rock, rock.vs(scissors));
    }

    @Test
    public void rockLostWithPaper() {
        assertEquals(paper, rock.vs(paper));
    }

    @Test
    public void rockTieWithRock() {
        assertEquals(Rock.getInstance(), rock.vs(rock));
    }

    @Test
    public void paperBeatsRock() {
        assertEquals(paper, paper.vs(rock));
    }

    @Test
    public void paperLostWithScissors() {
        assertEquals(scissors, paper.vs(scissors));
    }

    @Test
    public void paperTieWithPaper() {
        assertEquals(Paper.getInstance(), paper.vs(paper));
    }

    @Test
    public void scissorsBeatsPaper() {
        assertEquals(scissors, scissors.vs(paper));
    }

    @Test
    public void scissorsLostWithRock() {
        assertEquals(rock, scissors.vs(rock));
    }

    @Test
    public void scissorsTieWithScissors() {
        assertEquals(Scissors.getInstance(), scissors.vs(scissors));
    }
}
