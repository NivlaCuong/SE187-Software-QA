package TriangleChecker;

/**
 * TriangleChecker.Main class to run the project
 */
public class Main {

    public static void main(String[] args) {
        TriangleChecker triangleChecker = new TriangleChecker(4,5,3);

        triangleChecker.checkTriangleType();

        System.out.println(triangleChecker.getTriangle());
    }
}
