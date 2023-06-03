public class UniqueCharCounter {
    public int count(String phrase) {
        int count = 0, currentCount = 0;
        String[] splitPhrase = phrase.split("");
        for (int i = 0; i < splitPhrase.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (splitPhrase[i].equals(splitPhrase[j])) {
                    currentCount++;
                }
            }
            if (currentCount == 1) count++;
            currentCount = 0;
        }
        return count;
    }
}
