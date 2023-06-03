import java.util.Arrays;

//Напиши клас WordSplitter. У цьому класі створи метод public String[] split(String phrase).
//Метод приймає на вхід рядок, поділяє його на слова, і повертає масив рядків. Кожен рядок – окреме слово.
//        Словом вважається будь-яка послідовність символів, крім пробілів.
//        Гарантується, що вхідний рядок містить лише символи англійського алфавіту, цифри та пробіли.
public class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}