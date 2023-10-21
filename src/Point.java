import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static Point inputPoint() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x-coordinate: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y-coordinate: ");
        double y = scanner.nextDouble();
        return new Point(x, y);
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
}
