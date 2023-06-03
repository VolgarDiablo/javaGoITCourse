//Напиши клас DoubleSpaceCleaner. У цього класу створи метод public String clean(String phrase).
//Метод приймає на вхід рядок, і повертає його, тільки без подвійних пробілів (між кожним словом повинен залишитися рівно один пробіл).
//Також метод повинен видалити всі пробіли на початку та в кінці рядка.
public class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}