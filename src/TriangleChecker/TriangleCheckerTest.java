package TriangleChecker;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class TriangleCheckerTest {

	/**
	 *
	 */
	@Test
	public void test() {

		checkTrianglesWithAtLeastTwoDiffLength();

		checkEquilateralTriangles();

		checkWithTwoSameSide();

		checkWithOneNegativeNumber();

	}

	/**
	 * Check The Triangle with 2 fixed different side's length Y = 4 and Z = 3 with X is a number from -10 to 10
	 */
	private void checkTrianglesWithAtLeastTwoDiffLength() {
		// check if the triangle has at least two different lengths
		for (int i = - 10; i < 10; i++) {
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

	/**
	 *
	 */
	private void checkEquilateralTriangles() {
		for (int i = - 100; i < 100; i++) {
			TriangleChecker triangleChecker = new TriangleChecker(i,i,i);
			triangleChecker.checkTriangleType();
			if (i <= 0) {
				assertEquals(triangleChecker.getTriangle().getTriangleType(), TriangleChecker.TriangleType.INVALID);
			} else {
				assertEquals(triangleChecker.getTriangle().getTriangleType(), TriangleChecker.TriangleType.EQUILATERAL);
			}
		}
	}

	/**
	 * Run with 2 equal value
	 */
	private void checkWithTwoSameSide() {
		for(int i = -100; i < 100; i++){
			TriangleChecker triangleChecker2 = new TriangleChecker(i,10,10);
			triangleChecker2.checkTriangleType();
			if(i < 1){
				assertEquals(triangleChecker2.getTriangle().getTriangleType(), TriangleChecker.TriangleType.INVALID);
			}else if(i >= 20){
				assertEquals(triangleChecker2.getTriangle().getTriangleType(), TriangleChecker.TriangleType.INVALID);

			}else if(i == 10){
				assertEquals(triangleChecker2.getTriangle().getTriangleType(), TriangleChecker.TriangleType.EQUILATERAL);

			}else {
				assertEquals(triangleChecker2.getTriangle().getTriangleType(), TriangleChecker.TriangleType.ISOSCELES);
			}

		}
	}

	/**
	 *
	 */
	private void checkWithOneNegativeNumber() {
		for(int i = -100; i < 100; i++){
			TriangleChecker triangleChecker3 = new TriangleChecker(i,10,-7);
			triangleChecker3.checkTriangleType();
			if(i < -10){
				assertEquals(triangleChecker3.getTriangle().getTriangleType(), TriangleChecker.TriangleType.INVALID);
			}else
				assertEquals(triangleChecker3.getTriangle().getTriangleType(), TriangleChecker.TriangleType.INVALID);

		}
	}
}
