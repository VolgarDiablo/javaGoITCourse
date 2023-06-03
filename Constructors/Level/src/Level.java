public class Level {
    private final LevelInfo levelInfo;
    private final Point[] points;

    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + this.levelInfo.name + ", difficulty is " + this.levelInfo.difficulty + ", point count is " + this.points.length;
    }

    public int calculateLevelHash() {
        int sum = 0;
        for (Point point : points) {
            sum += point.x * point.y;
        }
//        for (int i = 0; i < points.length; i++) {
//            sum += points[i].x * points[i].y;
//        }
        return sum;
    }

    public static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static class LevelInfo {
        private final String name;
        private final String difficulty;

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }
    }
}