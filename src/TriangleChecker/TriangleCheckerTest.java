package TriangleChecker;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleCheckerTest {

	@Test
	public void test() {
		checkTrianglesWithAtLeastTwoDiffLength();
		checkEquilateralTriangles();
	}
	
	private void checkTrianglesWithAtLeastTwoDiffLength() {
		// check if the triangle has at least two different lengths
		for (int i = -5; i < 10; i++) {
			TriangleChecker triangleChecker = new TriangleChecker(i,4,3);
			triangleChecker.checkTriangleType();
			if (i < 2) { // (0, 4, 3), (1, 4, 3)
				assertEquals(triangleChecker.getTriangle().getTriangleType(), TriangleChecker.TriangleType.INVALID);
			} else if (i >= 7) {
				assertEquals(triangleChecker.getTriangle().getTriangleType(), TriangleChecker.TriangleType.INVALID);
			} else if (i == 3 || i == 4) { // (3, 4, 3), (4, 4, 3)
				assertEquals(triangleChecker.getTriangle().getTriangleType(), TriangleChecker.TriangleType.ISOSCELES);
			} else { // others
				assertEquals(triangleChecker.getTriangle().getTriangleType(), TriangleChecker.TriangleType.SCALENE);
			}
		}
	}
	
	private void checkEquilateralTriangles() {
		for (int i = -5; i < 5; i++) {
			TriangleChecker triangleChecker = new TriangleChecker(i,i,i);
			triangleChecker.checkTriangleType();
			if (i <= 0) {
				assertEquals(triangleChecker.getTriangle().getTriangleType(), TriangleChecker.TriangleType.INVALID);
			} else {
				assertEquals(triangleChecker.getTriangle().getTriangleType(), TriangleChecker.TriangleType.EQUILATERAL);
			}
		}
	}

}
