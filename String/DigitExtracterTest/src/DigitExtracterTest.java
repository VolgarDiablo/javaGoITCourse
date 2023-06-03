import java.util.Arrays;

//Напиши клас DigitExtracter. У цьому класі створи метод public int[] extract(String text).
//Метод приймає рядок і повертає масив усіх цифр, які є в цьому рядку, в тому ж порядку, в якому вони зустрічаються.
public class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}