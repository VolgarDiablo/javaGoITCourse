import java.util.Objects;

public class Square extends Shape {
    private double width;

    public Square(double width, String colorName) {
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
    public Square clone() throws CloneNotSupportedException {
        Square square = (Square) super.clone();
        square.color = ColorFactory.getColor(square.getColor().getName());
        return square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square square)) return false;
        return Double.compare(square.width, width) == 0
                && color.equals(square.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, color);
    }

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public double getArea() {
        return width * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
