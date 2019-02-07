package TriangleChecker;

/**
 * TriangleChecker.Main class to run the project
 */
public class Main {

    public static void main(String[] args) {
        TriangleChecker triangleChecker = new TriangleChecker(5,4,3);

        triangleChecker.checkTriangleType();

        System.out.println(triangleChecker.getTriangle());
    }
}
