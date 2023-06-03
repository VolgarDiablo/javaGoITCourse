public class WordSplitter {
    public String[] split(String phrase) {
        return phrase.toLowerCase().trim().split("\\s+");
    }
}
