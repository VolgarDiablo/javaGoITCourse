public class GooWordStat {
    private final String word;
    private final int freq;

    public GooWordStat(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

    public String getWord() {
        return word;
    }

    public int getFreq() {
        return freq;
    }

    @Override
    public String toString() {
        if (getFreq() < 1000) return "Word is [" + getWord() + "], search freq is LOW";
        else if (getFreq() >= 1000 && getFreq() < 100000) return "Word is [" + getWord() + "], search freq is MEDIUM";
        else if (getFreq() >= 100000 && getFreq() < 10000000) return "Word is [" + getWord() + "], search freq is HIGH";
        else return "Word is [" + getWord() + "], search freq is EXTRA HIGH";
    }
}