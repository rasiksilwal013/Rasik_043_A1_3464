    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of triangles you want to create: ");
            int numberOfTriangles = scanner.nextInt();

            if (numberOfTriangles < 3) {
                System.out.println("Error: You must create at least 3 triangles.");
                return;
            }

            Triangle[] triangles = new Triangle[numberOfTriangles];

            for (int i = 0; i < numberOfTriangles; i++) {
                System.out.println("Enter vertices for Triangle " + (i + 1) + ":");
                Point point1 = Point.inputPoint();
                Point point2 = Point.inputPoint();
                Point point3 = Point.inputPoint();
                triangles[i] = new Triangle(point1, point2, point3);
            }

            for (int i = 0; i < numberOfTriangles; i++) {
                System.out.println("Triangle " + (i + 1) + " - Type: " + triangles[i].getTriangleType());
                System.out.println("Triangle " + (i + 1)  + " Perimeter: " + triangles[i].getPerimeter());

                double area = triangles[i].getArea();
                System.out.println("Triangle " + (i + 1) + " Area: " + area);
            }




        }
    }
