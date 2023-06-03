import java.util.Arrays;
import java.util.Collections;

public final class Phrase {
    private final String[] words;

    public Phrase(String[] words) {
        this.words = Collections.unmodifiableList(Arrays.asList(words)).toArray(new String[words.length]);
    }

    @Override
    public String toString() {
        return String.join(" ", words);
    }
}
