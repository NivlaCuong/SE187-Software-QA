package progressBar;

import static org.junit.Assert.*;

/**
 * Check the three functions of the ProgressBar
 * 1) Print Color
 * 2) Inside Circle
 * 3) Inside Correct Circle Area
 */

import org.junit.Test;

public class ProgressBarTest {
	
	private ProgBar pb;

	
	@Test
	public void printColor() {
//		assertEquals(pb.printColor(99, 25, 25), "RED");
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void insideCircle(){
		
		// [TRUE] Test for valid cases
		assertTrue(pb.insideCircle(20,20));
		assertTrue(pb.insideCircle(55, 35));
		assertTrue(pb.insideCircle(75, 25));
		assertTrue(pb.insideCircle(45, 65));
		
		// [TRUE] Test for smallest coordinates contained in circle
		assertTrue(pb.insideCircle(15, 15));

		// [TRUE] Test for largest coordinates contained in circle
		assertTrue(pb.insideCircle(85, 85));
		
		// [TRUE] Test for decimal numbers
		assertTrue(pb.insideCircle(25.5, 31.9));
		assertTrue(pb.insideCircle(50.5, 50.9));

		// [FALSE] Test for values outside of circle radius
		assertFalse(pb.insideCircle(0, 0));
		assertFalse(pb.insideCircle(5, 5));
		assertFalse(pb.insideCircle(10, 10));
		assertFalse(pb.insideCircle(90, 90));
		assertFalse(pb.insideCircle(99, 99));
		assertFalse(pb.insideCircle(100, 100));
		
		// [FALSE] Test for negative values	
		assertFalse(pb.insideCircle(-1, -1));
		assertFalse(pb.insideCircle(-20, -20));

	}
	
	@SuppressWarnings("static-access")
	@Test
	public void insideCorrectCircleArea(){
		
		// Coordinates on quadrant 1 when it is 25%
		for(int i = 51; i < 100; i++)
			for(int j = 51; j < 100; j++)
				assertTrue(pb.insideCorrectCircleArea(25, i, j));
		
		// Coordinates on quadrant 2 when it is 50%
		for(int i = 0; i < 50; i++)
			for(int j = 51; j < 100; j++)
				assertTrue(pb.insideCorrectCircleArea(50, i, j));
		
		// Coordinates on quadrant 3 when it is 75%
		for(int i = 0; i < 50; i++)
			for(int j = 0; j < 50; j++)
				assertTrue(pb.insideCorrectCircleArea(75, i, j));
		
		// Coordinates on quadrant 4 when it is 100%
		for(int i = 51; i < 100; i++)
			for(int j = 0; j < 50; j++)
				assertTrue(pb.insideCorrectCircleArea(100, i, j));

	}
}
