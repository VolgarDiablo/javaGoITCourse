public class CircleIntersector {
    private int x1;
    private int y1;
    private int r1;
    private int x2;
    private int y2;
    private int r2;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
        this.x1 = x1;
        this.y1 = y1;
        this.r1 = r1;
        this.x2 = x2;
        this.y2 = y2;
        this.r2 = r2;
    }

    public boolean intersectCircles() {
        double length = 0, sumRadius = this.r1 + this.r2, subRadius = Math.abs(this.r1 - this.r2);
        length = Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
        if (this.r1 == this.r2 && this.x1 == this.x2 && this.y1 == this.y2) {
            return true;
        }
        if (subRadius == length || sumRadius == length) {
            return true;
        } else return !(length > sumRadius) && !(length < subRadius);
    }

    @Override
    public String toString() {
        return intersectCircles() ? "intersects" : "not intersects";
    }
}