//Напиши клас PalindromeCounter. У класі створи метод public int count(String phrase).
//Метод приймає рядок, який складається зі слів, розділених одним пробілом, і повертає кількість паліндромів у цьому рядку.
public class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}