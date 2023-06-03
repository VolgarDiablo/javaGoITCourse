import java.util.Objects;

public class Triangle extends Shape {
    private double width;
    private double height;

    public Triangle(double width, double height, String colorName) {
        this.width = width;
        this.height = height;
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
    public Triangle clone() throws CloneNotSupportedException {
        Triangle triangle = (Triangle) super.clone();
        triangle.color = ColorFactory.getColor(triangle.getColor().getName());
        return triangle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle triangle)) return false;
        return Double.compare(triangle.width, width) == 0
                && Double.compare(triangle.height, height) == 0
                && color.equals(triangle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, color);
    }

    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public double getArea() {
        return width * height / 2.0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
