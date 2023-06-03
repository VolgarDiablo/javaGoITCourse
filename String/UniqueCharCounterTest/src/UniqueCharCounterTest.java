//Напиши клас UniqueCharCounter. У цьому класі створи метод public int count(String phrase),
//який приймає рядок та повертає кількість унікальних символів у цьому рядку.
//        Рядок складається лише з цифр, символів англійського алфавіту, та пробілів.
public class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}