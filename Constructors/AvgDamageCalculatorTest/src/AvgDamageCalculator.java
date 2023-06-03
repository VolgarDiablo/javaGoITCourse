class AvgDamageCalculator {
    public int calculateAvg(int[] samples) {
        int sum = 0;
        for (int sampleValue : samples) {
            sum += sampleValue;
        }
        try {
            return sum / samples.length;
        } catch (Exception e) {
            return 0;
        }
    }
}