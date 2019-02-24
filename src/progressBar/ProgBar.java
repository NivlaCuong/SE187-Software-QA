package progressBar;

public class ProgBar {
	
	public String printColor(double percentage, double x, double y) {
		double degreesForRedColor = percentage / 100 * 360;
		if (percentage < 0 || percentage > 100) return "BLUE";
		if (!insideCircle(x, y)) return "BLUE";
		if (insideCorrectCircleArea(degreesForRedColor, x, y)) return "RED";
		else return "BLUE";
	}
	
	public boolean insideCircle(double x, double y) {
		// the center point of the circle is (50, 50)
		// if the distance between a point and the center point > 50, return false
		return (Math.pow(Math.pow((x - 50), 2) + Math.pow((y - 50), 2), 0.5) < 50);
	}
	
	public boolean insideCorrectCircleArea(double degreesForRedColor, double x, double y) {
		// the center point of the circle is (50, 50)
		// use trigonometry to obtain the angle based on the center point
		return (Math.toDegrees(Math.atan(Math.abs(x - 50) / Math.abs(y - 50))) < degreesForRedColor);
	}
	
	public static void main(String args[]) {
		// below code is just for testing, should be tested more thoroughly using JUnit
		ProgBar pb = new ProgBar();
		System.out.println(pb.printColor(12.5, 83, 33));
		System.out.println(pb.printColor(50, 25, 25));
		System.out.println(pb.printColor(75, 83, 33));
		System.out.println(pb.printColor(25, 1, 33));
//		pb.printColor(12.5, 83, 33);

	}
	
	// utility method
	public void println(String msg) {
		System.out.println(msg);
	}
}
