public class PalindromeCounter {
    public int count(String phrase) {
        int count = 0;
        String[] splitPhrase = phrase.split(" ");
        for (String elem : splitPhrase) {
            StringBuilder stringBuilder = new StringBuilder(elem).reverse();
            if (elem.equalsIgnoreCase(stringBuilder.toString())) count++;
        }
        return count;
    }
}
