public class DoubleSpaceCleaner {
    public String clean(String phrase) {
        return phrase.strip().replaceAll(" +", " ");
    }
}
