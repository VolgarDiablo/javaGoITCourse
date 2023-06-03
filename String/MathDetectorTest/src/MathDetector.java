import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathDetector {
    public boolean isMath(String text) {
        boolean equal = false;
        boolean mathematicalOperator = false;
        boolean countNumber = false;
        int count = 0;

        String searchEqual = "=";
        String[] operators = {"+", "-", "*", "/"};
        String[] splitText = text.split("");

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(text);

        equal = text.contains(searchEqual);

        for (String elem : operators) {
            for (String str : splitText) {
                if (elem.equals(str)) {
                    mathematicalOperator = true;
                    break;
                }
            }
        }
        while (matcher.find()) {
            count++;
            if (count == 2) {
                countNumber = true;
                break;
            }
        }
        return countNumber && equal && mathematicalOperator;
    }
}
