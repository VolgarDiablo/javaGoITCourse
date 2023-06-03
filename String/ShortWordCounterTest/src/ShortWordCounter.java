public class ShortWordCounter {
    public int count(String phrase, int minLength) {
        int count = 0;
        String[] splitPhrase = phrase.split(" ");
        for (String elem : splitPhrase) {
            if (elem.length() <= minLength) count++;
        }
        return count;
    }
}
