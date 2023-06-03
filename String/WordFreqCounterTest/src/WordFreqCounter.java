public class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        float count = 0;
        String[] splitPhrase = phrase.split(" ");
        for (String elem : splitPhrase) {
            if (elem.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count / splitPhrase.length;
    }
}
