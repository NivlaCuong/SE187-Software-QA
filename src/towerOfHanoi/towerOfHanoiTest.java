package towerOfHanoi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class towerOfHanoiTest {

    private towerOfHanoi towerOfHanoi;
    private int input;

    @Before
    public void setUp() throws Exception {
        input = 3;
        towerOfHanoi = new towerOfHanoi(input);
    }

    /**
     * Test the Logic of the game
     * TODO: Need to write more instance variables for testing
     * TODO: Draw a control flow graph for this function.
     */
    @Test
    public void playTowerOfHanoi() {
        towerOfHanoi.playTowerOfHanoi(input, 'A', 'C', 'B');
    }
}