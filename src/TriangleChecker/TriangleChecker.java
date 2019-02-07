package TriangleChecker;

/**
 * This class will determine if x, y, and z form a triangle
 * If yes then it will determine if the triangle is
 *      Equilateral
 *      Isosceles or
 *      Scalene
 */
class TriangleChecker {

    /** An Enum Type of the Triangle */
    enum TriangleType {
        EQUILATERAL, ISOSCELES, SCALENE, INVALID
    }

    /** The triangle that is used to check for type */
    private Triangle triangle;

    /**
     * Constructor: Create the new triangle with specific length of each side
     * @param x: length of x
     * @param y: length of y
     * @param z: length of z
     */
    TriangleChecker(int x, int y, int z) {
        triangle = new Triangle(x, y, z);
    }

    /**
     * Check the type of the triangle by going each cases of all 3 lengths
     */
    void checkTriangleType() {

        int x = triangle.x;
        int y = triangle.y;
        int z = triangle.z;

        if (x <= 0 || y <= 0 || z <= 0) triangle.triangleType = TriangleType.INVALID;                   // INVALID
        else if (x >= y + z || z >= x + y || y >= x + z) triangle.triangleType = TriangleType.INVALID;  // INVALID
        else if (x == y && y == z) triangle.triangleType = TriangleType.EQUILATERAL;                    // EQUILATERAL Case
        else if (x == y || y == z || x == z) triangle.triangleType = TriangleType.ISOSCELES;            // ISOSCELES Case
        else triangle.triangleType = TriangleType.SCALENE;                                              // SCALENE Case
    }

    /**
     * @return the Triangle to be checked for type
     */
    Triangle getTriangle() {
        return triangle;
    }

    /**
     * The Triangle class that is consisted of 3 sides of the triangles
     */
    public class Triangle {

        /** The length of the triangle */
        private int x, y, z;

        /** The type of this triangle */
        private TriangleType triangleType;

        /**
         * Constructor: Initialize the length of the triangle
         * @param x: length of x
         * @param y: length of y
         * @param z: length of z
         */
        Triangle(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public String toString() {
            return "This triangle has the length of X = " + x + ", Y = " + y + ", Z = " + z + ", and type is " + triangleType;
        }
        
        public TriangleType getTriangleType() {
        	return triangleType;
        }
    }

}
