import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameCounter {
    public int count(String text) {
        int count = 0;
        String[] splitText = text.split(" ");
        Pattern pattern = Pattern.compile("[A-Z]+[a-z]");

        for (String str : splitText) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) count++;
        }

        return count;
    }
}
