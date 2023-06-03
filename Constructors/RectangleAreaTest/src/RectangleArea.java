public class RectangleArea {
    private final int firstPointX;
    private final int firstPointY;
    private final int secondPointX;
    private final int secondPointY;

    public RectangleArea(int[] coords) {
        this.firstPointX = coords[0];
        this.firstPointY = coords[1];
        this.secondPointX = coords[2];
        this.secondPointY = coords[3];
    }

    public int getArea() {
        int result = 0;
        int thirdPointX = this.firstPointX, thirdPointY = this.secondPointY, lengthFirstLine = 0, lengthSecondLine = 0;

        lengthFirstLine = (int) Math.round(Math.sqrt(Math.pow(thirdPointY - this.firstPointY, 2) + Math.pow(thirdPointX - this.firstPointX, 2)));
        lengthSecondLine = (int) Math.round((Math.sqrt(Math.pow(this.secondPointY - thirdPointY, 2) + Math.pow(this.secondPointX - thirdPointX, 2))));
        result = lengthFirstLine * lengthSecondLine;

        return result;
    }
}
