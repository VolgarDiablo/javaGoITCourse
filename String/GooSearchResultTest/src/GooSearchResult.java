public class GooSearchResult {
    private final String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        String str = getUrl();
        int currentIncluding = 0, indexStart = 0, indexEnd = str.length();
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '/') {
                currentIncluding++;
            }
            if (currentIncluding == 2 && !flag) {
                indexStart = i;
                flag = true;
            }
            if (currentIncluding == 3) {
                indexEnd = i;
                break;
            }
        }
        return str.substring(indexStart + 1, indexEnd);
    }
}
