package progressBar;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * Check the three functions of the ProgressBar
 * 1) Print Color
 * 2) Inside Circle
 * 3) Inside Correct Circle Area
 */

public class ProgBarTest {

	private ProgBar pb = new ProgBar();


	@Test
	public void printColor() {
		
		//Tests the percentage for out of bounds for ERROR	
		for(int i = -50; i<0 ;i++){
			assertEquals("ERROR", pb.printColor(i, 25, 25));
		}
		for(int i=101; i <150; i++){
			assertEquals("ERROR", pb.printColor(i, 50, 50));
		}		
		
		//Test points outside of circle
		assertEquals("BLUE", pb.printColor(5, 0, 80));
		assertEquals("BLUE", pb.printColor(25, 10, 40));
		assertEquals("BLUE", pb.printColor(50, 45, 30));
		assertEquals("BLUE", pb.printColor(75, 10, 85));

		//Test points inside circle
		assertEquals("RED", pb.printColor(15, 51, 60));
		assertEquals("RED", pb.printColor(25, 55, 90));
		assertEquals("RED", pb.printColor(50, 70, 50));
		assertEquals("RED", pb.printColor(75, 40, 30));


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
		
		//Testing coordinates on quadrant 1
		assertTrue(pb.insideCorrectCircleArea(25, 50, 50));
		assertTrue(pb.insideCorrectCircleArea(25,70, 90));
		assertTrue(pb.insideCorrectCircleArea(25, 100, 100));
		assertFalse(pb.insideCorrectCircleArea(25, 0, 0));
		
		//Testing coordinates on quadrant 2
		assertTrue(pb.insideCorrectCircleArea(50, 51, 49));
		assertTrue(pb.insideCorrectCircleArea(50, 75, 25));
		assertTrue(pb.insideCorrectCircleArea(50, 80, 10));
		assertFalse(pb.insideCorrectCircleArea(50,0,0));
		
		//Testing coordinates on quadrant 3
		assertTrue(pb.insideCorrectCircleArea(75, 10, 10));
		assertTrue(pb.insideCorrectCircleArea(75, 0, 25));
		assertTrue(pb.insideCorrectCircleArea(75, 40, 45));
		assertFalse(pb.insideCorrectCircleArea(75, 40, 100));

		//Testing coordinates on quadrant 4
		assertTrue(pb.insideCorrectCircleArea(100, 10, 51));
		assertTrue(pb.insideCorrectCircleArea(100, 25, 75));
		assertTrue(pb.insideCorrectCircleArea(100, 40, 60));
		assertTrue(pb.insideCorrectCircleArea(100, 0, 100));


//		 Coordinates on quadrant 1 when it is 25%
		for(int i = 51; i <= 100; i++)
			for(int j = 51; j <= 100; j++)
				assertTrue(pb.insideCorrectCircleArea(25, i, j));

//		 Coordinates on quadrant 2 when it is 50%
		for(int i = 51; i <= 100; i++)
			for(int j = 0; j <= 50; j++)
				assertTrue(pb.insideCorrectCircleArea(50, i, j));

		// Coordinates on quadrant 3 when it is 75%
		for(int i = 0; i < 50; i++)
			for(int j = 0; j < 50; j++)
				assertTrue(pb.insideCorrectCircleArea(75, i, j));

//		// Coordinates on quadrant 4 when it is 100%
		for(int i = 0; i < 50; i++)
			for(int j = 51; j < 100; j++)
				assertTrue(pb.insideCorrectCircleArea(100, i, j));

	}

}
