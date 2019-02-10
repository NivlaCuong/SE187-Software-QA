package TriangleChecker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
		
		for(int i = 0; i< 100; i++){
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
		
		for(int i = -10; i< 20; i++){
			TriangleChecker triangleChecker3 = new TriangleChecker(i,10,-7);
			triangleChecker3.checkTriangleType();
			if(i < -10){
				assertEquals(triangleChecker3.getTriangle().getTriangleType(), TriangleChecker.TriangleType.INVALID);
			}else 
				assertEquals(triangleChecker3.getTriangle().getTriangleType(), TriangleChecker.TriangleType.INVALID);
			
		}
	}

}