public class Triangle {
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;

    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    public String getTriangleType() {
        double side1 = Point.distance(vertex1, vertex2);
        double side2 = Point.distance(vertex2, vertex3);
        double side3 = Point.distance(vertex3, vertex1);

        if (side1 == side2 && side1 == side3) {
            return "Equilateral";
        } else if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {
            return "Isosceles";
        } else {
            return "Unknown";
        }
    }

    public double getPerimeter() {
        return Point.distance(vertex1, vertex2) + Point.distance(vertex2, vertex3) + Point.distance(vertex3, vertex1);
    }
}
