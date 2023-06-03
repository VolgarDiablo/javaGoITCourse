import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shape square = new Square(5.3, "Blue");
        Shape rectangle = new Rectangle(23.4, 84.3, "Green");
        Shape cube = new Cube(8.7, "Red");
        Shape triangle = new Triangle(10.6, 47.2, "Grey");
        Shape circle = new Circle(12.3, "Green");

        try {
            Shape clonedSquare = ((Square) square).clone();
            System.out.println(square == clonedSquare);
            System.out.println(square.equals(clonedSquare));
            System.out.println(square);
            System.out.println(clonedSquare);
            System.out.println(square.getDescription() + clonedSquare.getDescription());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Shape clonedTriangle = ((Triangle) triangle).clone();
            System.out.println(triangle == clonedTriangle);
            System.out.println(triangle.equals(clonedTriangle));
            System.out.println(triangle);
            System.out.println(clonedTriangle);
            System.out.println(triangle.getDescription() + clonedTriangle.getDescription());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Shape clonedRectangle = ((Rectangle) rectangle).clone();
            System.out.println(rectangle == clonedRectangle);
            System.out.println(rectangle.equals(clonedRectangle));
            System.out.println(rectangle);
            System.out.println(clonedRectangle);
            System.out.println(rectangle.getDescription() + clonedRectangle.getDescription());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Shape clonedCube = ((Cube) cube).clone();
            System.out.println(cube == clonedCube);
            System.out.println(cube.equals(clonedCube));
            System.out.println(cube);
            System.out.println(clonedCube);
            System.out.println(cube.getDescription() + clonedCube.getDescription());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Shape clonedCircle = ((Circle) circle).clone();
            System.out.println(circle == clonedCircle);
            System.out.println(circle.equals(clonedCircle));
            System.out.println(circle);
            System.out.println(clonedCircle);
            System.out.println(circle.getDescription() + clonedCircle.getDescription());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}