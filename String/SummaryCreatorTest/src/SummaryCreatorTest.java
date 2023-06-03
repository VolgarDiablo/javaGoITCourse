//Напиши клас SummaryCreator. У цьому класі напиши метод public String create(String text).
//Метод приймає рядок, і повертає його короткий варіант згідно з алгоритмом, описаним у теорії.
public class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}