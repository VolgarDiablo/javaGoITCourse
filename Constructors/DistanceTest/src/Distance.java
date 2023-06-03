public class Distance {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance() {
        int result;
        result = (int) Math.round(Math.sqrt(Math.pow(this.endX - this.startX, 2) + (Math.pow(this.endY - startY, 2))));
        return result;
    }
}