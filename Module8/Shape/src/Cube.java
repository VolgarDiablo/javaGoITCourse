import java.util.Objects;

public class Cube extends Shape {
    private double width;

    public Cube(double width, String colorName) {
        this.width = width;
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
    public Cube clone() throws CloneNotSupportedException {
        Cube cube = (Cube) super.clone();
        cube.color = ColorFactory.getColor(cube.getColor().getName());
        return cube;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cube cube)) return false;
        return Double.compare(cube.width, width) == 0
                && color.equals(cube.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, color);
    }

    @Override
    public String getName() {
        return "cube";
    }

    @Override
    public double getArea() {
        return 6 * width * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
