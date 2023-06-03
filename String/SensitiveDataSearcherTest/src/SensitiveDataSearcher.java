public class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        boolean hasFound = false;
        String[] searchWords = {"pass", "key", "login", "email"};
        for (String elem : searchWords) {
            if (phrase.toLowerCase().contains(elem)) {
                hasFound = true;
                break;
            }
        }
        return hasFound;
    }
}
