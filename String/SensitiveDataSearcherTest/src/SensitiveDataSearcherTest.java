//Напиши клас SensitiveDataSearcher. У цього класу створи метод public boolean isSensitiveDataPresent(String phrase).
//Він приймає рядок і повертає true, якщо у рядку є чутливі дані.

public class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}