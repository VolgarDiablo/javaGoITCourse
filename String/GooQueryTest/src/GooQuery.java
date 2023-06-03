public class GooQuery {
    private final String language;
    private final String text;

    public GooQuery(String language, String text) {
        this.language = language;
        this.text = text;
    }

    public String getLanguage() {
        return language;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Searching [" + getText() + "], " + "using language: " + getLanguage();
    }
}