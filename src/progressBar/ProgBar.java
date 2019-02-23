package progressBar;

public class ProgBar {
	
	public static void printColor(double percentage, double x, double y) {
		double degreesForRedColor = percentage / 100 * 360;
		if (percentage < 0 || percentage > 100) println("Invalid percentage");
		if (!insideCircle(x, y)) println("Coordinate out of circle");
		if (insideCorrectCircleArea(degreesForRedColor, x, y)) println("RED");
		else println("BLUE");
	}
	
	public static boolean insideCircle(double x, double y) {
		// the center point of the circle is (50, 50)
		// if the distance between a point and the center point > 50, return false
		return (Math.pow(Math.pow((x - 50), 2) + Math.pow((y - 50), 2), 0.5) < 50);
	}
	
	public static boolean insideCorrectCircleArea(double degreesForRedColor, double x, double y) {
		// the center point of the circle is (50, 50)
		// use trigonometry to obtain the angle based on the center point
		return (Math.toDegrees(Math.atan(Math.abs(x - 50) / Math.abs(y - 50))) < degreesForRedColor);
	}
	
	public static void main(String args[]) {
		// below code is just for testing, should be tested more thoroughly using JUnit
		printColor(12.5, 83, 33);
	}
	
	// utility method
	public static void println(String msg) {
		System.out.println(msg);
	}
}
