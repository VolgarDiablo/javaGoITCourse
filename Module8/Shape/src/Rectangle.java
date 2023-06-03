import java.util.Objects;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, String colorName) {
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
    public Rectangle clone() throws CloneNotSupportedException {
        Rectangle rectangle = (Rectangle) super.clone();
        rectangle.color = ColorFactory.getColor(rectangle.getColor().getName());
        return rectangle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        return Double.compare(rectangle.width, width) == 0
                && Double.compare(rectangle.height, height) == 0
                && color.equals(rectangle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, color);
    }

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public double getArea() {
        return width * height;
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
