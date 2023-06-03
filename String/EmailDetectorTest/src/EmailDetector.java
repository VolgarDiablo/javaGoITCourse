import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDetector {
    public boolean isPresent(String text) {
        String[] splitText = text.split(" ");
        boolean isFound = false;
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}", Pattern.CASE_INSENSITIVE);
        //Pattern pattern = Pattern.compile("^[A-Z0-9+_.-]{2,}+@[A-Z0-9.-]{2,}+$", Pattern.CASE_INSENSITIVE);
        for (String str : splitText) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }
}