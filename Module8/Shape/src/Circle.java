import java.util.Objects;

public class Circle extends Shape {
    private double radius;
    private static final double PI = Math.PI;

    public Circle(double radius, String colorName) {
        this.radius = radius;
        this.color = ColorFactory.getColor(colorName);
    }

    @Override
    public String getDescription() {
        return "Description of the figure: \n"
                + "1. Name: " + getName() + "\n"
                + "2. Area: " + getArea() + "\n"
                + "3. Color: " + color.getName().toLowerCase() + "\n";
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        Circle circle = (Circle) super.clone();
        circle.color = ColorFactory.getColor(circle.getColor().getName());
        return circle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle circle)) return false;
        return Double.compare(circle.radius, radius) == 0
                && color.equals(circle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, color);
    }

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
