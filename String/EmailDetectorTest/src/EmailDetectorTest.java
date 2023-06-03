//Напиши програму, яка визначатиме, чи є у тексті email.
//        Email вважається знайденим, якщо є рядок виду xx@xx, де замість x - будь-який символ, крім пробілу.
//        Напиши клас EmailDetector. У цьому класі створи метод public boolean isPresent(String text).
//Він приймає рядок та повертає true лише в тому випадку, якщо в ньому є email згідно з описаним алгоритмом.
public class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}