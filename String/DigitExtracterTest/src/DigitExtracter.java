import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitExtracter {
    public int[] extract(String text) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(text);
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        int count = 0, index = 0;

        while (matcher.find()) count++;

        int[] array = new int[count];

        for (String elem : text.split("")) {
            for (String str : numbers) {
                if (elem.equals(str)) {
                    array[index] = Integer.parseInt(elem);
                    index++;
                }
            }
        }
        return array;
    }
}
