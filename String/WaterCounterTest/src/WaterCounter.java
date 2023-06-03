import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WaterCounter {
    public double count(String text) {
        double countSpace = 0;
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) countSpace++;

        return countSpace / text.length();
    }
}
