public class SummaryCreator {
    public String create(String text) {
        String outString = text;
        if (text.length() > 15) {
            outString = text.substring(0, 15);
            if (text.charAt(15) != ' ') outString += "...";
        }
        return outString;
    }
}
