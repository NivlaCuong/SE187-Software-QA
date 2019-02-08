package TriangleChecker;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleCheckerTest {

	@Test
	public void test() {
		// check if different triangle lengths would lead to different output
		for (int i = 0; i < 10; i++) {
			TriangleChecker triangleChecker = new TriangleChecker(i,4,3);
			triangleChecker.checkTriangleType();
			if (i < 2) {
				assertEquals(triangleChecker.getTriangle().getTriangleType(), TriangleChecker.TriangleType.INVALID);
			} else if (i >= 7) {
				assertEquals(triangleChecker.getTriangle().getTriangleType(), TriangleChecker.TriangleType.INVALID);
			} else if (i == 3 || i == 4) {
				assertEquals(triangleChecker.getTriangle().getTriangleType(), TriangleChecker.TriangleType.ISOSCELES);
			} else {
				assertEquals(triangleChecker.getTriangle().getTriangleType(), TriangleChecker.TriangleType.SCALENE);
			}
		}
		// test if my branch works
	}

}
