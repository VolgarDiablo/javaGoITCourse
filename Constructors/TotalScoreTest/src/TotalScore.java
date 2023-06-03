public class TotalScore {
    public int sum(int[] scores) {
        int result = 0;

        if (scores.length == 0) return result;

        for (int i = 0; i < scores.length; i++) {
            result += scores[i];
        }
        return result;
    }
}
