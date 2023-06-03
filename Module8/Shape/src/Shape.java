public abstract class Shape implements Cloneable {
    protected Color color;

    public abstract String getDescription();

    public abstract String getName();

    public abstract double getArea();

    //new
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    //
}
