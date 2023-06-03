public class Rectangle {
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean canPlaceInto(Rectangle anotherRect) {
        int squareCurrentRectangle = this.a * this.b;
        int squareSecondRectangle = anotherRect.a * anotherRect.b;
        boolean isOk = squareCurrentRectangle <= squareSecondRectangle;

        if (this.a <= anotherRect.a && this.b <= anotherRect.b && isOk) {
            return true;
        } else return this.a <= anotherRect.b && this.b <= anotherRect.a && isOk;
    }
}
