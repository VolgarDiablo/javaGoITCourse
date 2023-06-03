import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BigOrSmall {
    public String calculate(String text) {
        int countLowerCase = 0, countUpperCase = 0;

        Pattern patternLowerCase = Pattern.compile("[a-z]");
        Pattern patternUpperCase = Pattern.compile("[A-Z]");

        Matcher matcherLowerCase = patternLowerCase.matcher(text);
        Matcher matcherUpperCase = patternUpperCase.matcher(text);

        while (matcherLowerCase.find()) countLowerCase++;
        while (matcherUpperCase.find()) countUpperCase++;

        if (countLowerCase > countUpperCase) return "Small";
        if (countLowerCase < countUpperCase) return "Big";
        return "Same";
    }
}
