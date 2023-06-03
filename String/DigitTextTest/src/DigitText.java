import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitText {
    public boolean detect(String text) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(text);
        return !matcher.find();
    }
}
