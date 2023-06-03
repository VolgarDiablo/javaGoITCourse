public class PunctuationMarkCounter {
    public int count(String phrase) {
        String[] punctuation = new String[]{",", ".", "!", ":", ";"};
        int count = 0;
        for (char elem : phrase.toCharArray()) {
            for (String symb : punctuation) {
                if (String.valueOf(elem).equals(symb)) {
                    count++;
                }
            }
        }
        return count;
    }
}
