package ar.fiuba.tecnicas.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RulesTest {

    private Element rock = Rock.getInstance();
    private Element paper = Paper.getInstance();
    private Element scissors = Scissors.getInstance();
    private Element fire = Fire.getInstance();

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
        assertEquals(rock, rock.vs(rock));
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
        assertEquals(paper, paper.vs(paper));
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
        assertEquals(scissors, scissors.vs(scissors));
    }

    @Test
    public void rockBeatsFire() {
        assertEquals(rock, fire.vs(rock));
    }

    @Test
    public void fireTieWithFire() {
        assertEquals(fire, fire.vs(fire));
    }

    @Test
    public void paperLostWithFire() {
        assertEquals(fire, fire.vs(paper));
    }

    @Test
    public void scissorsLostWithFire() {
        assertEquals(fire, fire.vs(scissors));
    }
}
