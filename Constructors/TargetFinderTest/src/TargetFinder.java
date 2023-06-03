public class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        double distance = 0, minDistance = 2147483647;
        int indexRow = 0;
        for (int i = 0; i < targets.length; i++) {
            distance = Math.sqrt(Math.pow(targets[i][0] - aiCoords[0], 2) + Math.pow(targets[i][1] - aiCoords[1], 2));
            if (distance < minDistance) {
                minDistance = distance;
                indexRow = i;
            }
        }
        return new int[]{targets[indexRow][0], targets[indexRow][1]};
    }
}
