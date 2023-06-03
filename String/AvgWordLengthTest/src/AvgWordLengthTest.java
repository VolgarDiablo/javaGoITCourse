//Напиши клас AvgWordLength. У цьому класі напиши метод public double count(String phrase).
//Метод приймає рядок, що складається зі слів, розділених рівно одним пробілом, і повертає середню довжину слова у цьому рядку.
public class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}