//Напиши клас DigitText. У цьому класі створи метод public boolean detect(String text).
//Він приймає рядок та повертає true у випадку, якщо рядок складається виключно з цифр та пробілів.
public class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}