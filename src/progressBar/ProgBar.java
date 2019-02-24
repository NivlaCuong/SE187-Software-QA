package progressBar;

public class ProgBar {
	
	public static void printColor(double percentage, double x, double y) {
		double degreesForRedColor = percentage / 100 * 360;
		if (percentage < 0 || percentage > 100) println("Invalid percentage");
		if (!insideCircle(x, y)) println("Coordinate out of circle\nBLUE");
		else {
			if (insideCorrectCircleArea(degreesForRedColor, x, y)) println("RED");
			else println("BLUE");
		}
		
	}
	
	public static boolean insideCircle(double x, double y) {
		// the center point of the circle is (50, 50)
		// if the distance between a point and the center point > 50, return false
		return Math.pow(Math.pow((x - 50), 2) + Math.pow((y - 50), 2), 0.5) < 50;
	}
	
	public static boolean insideCorrectCircleArea(double percentage, double x, double y) {
		// the center point of the circle is (50, 50)
		// use trigonometry to obtain the angle based on the center point
		double degreesForRedColor = percentage / 100 * 360;
//		println("degree for red color: " + degreesForRedColor);
		double degreesForQuadrant1 = Math.toDegrees(Math.atan((y - 50) / (x - 50)));
		double degreesForQuadrant23 = 180 + Math.toDegrees(Math.atan((y - 50) / (x - 50)));
		double degreesForQuadrant4 = 360 + Math.toDegrees(Math.atan((y - 50) / (x - 50)));
		if (x >= 50 && y >= 50) {
//			println("Quadrant 1: " + degreesForQuadrant1);
			return degreesForQuadrant1 <= degreesForRedColor;
		} else if (x < 50 && y >= 50 ) {
//			println("Quadrant 2: " + degreesForQuadrant23);
			return degreesForQuadrant23 <= degreesForRedColor;
		} else if (x < 50 && y < 50) {
//			println("Quadrant 3: " + degreesForQuadrant23);
			return degreesForQuadrant23 <= degreesForRedColor;
		} else {
//			println("Quadrant 4: " + degreesForQuadrant4);
			return degreesForQuadrant4 <= degreesForRedColor;
		}
	}
	
	public static void main(String args[]) {
		// below code is just for testing, should be tested more thoroughly using JUnit
	}
	
	// utility method
	public static void println(String msg) {
		System.out.println(msg);
	}
}
