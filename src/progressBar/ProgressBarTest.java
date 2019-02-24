package progressBar;

import org.junit.Test;

import static org.junit.Assert.*;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;

/**
 * Check the three functions of the ProgressBar
 * 1) Print Color
 * 2) Inside Circle
 * 3) Inside Correct Circle Area
 */

public class ProgressBarTest {
	
	ProgBar pb = new ProgBar();
	
	@Test
	public void printColor() {
		assertEquals("BLUE", pb.printColor(10, 25, 25));
		assertEquals("BLUE", pb.printColor(25, 25, 25));
		assertEquals("RED", pb.printColor(90, 25, 25));
		assertEquals("RED", pb.printColor(75, 25, 25));

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
		
//		assertEquals(pb.insideCorrectCircleArea(90, 30, 30), "RED");
		for(int i =0; i < 100; i++){
			if (i < 15 || i > 85){
				assertTrue(pb.insideCorrectCircleArea(50, i, i));
			} 
//			else {
//				assertFalse(pb.insideCorrectCircleArea(50, i, i));
//			}

		}
	}
}
